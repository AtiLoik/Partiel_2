package com.ensup.master;

import org.mockito.Mockito;

import com.ensup.master.dao.ICourseDao;
import com.ensup.master.dao.IStudentDao;
import com.ensup.master.metier.Course;
import com.ensup.master.metier.Student;
import com.ensup.master.serviceImpl.CourseService;
import com.ensup.master.serviceImpl.StudentService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	IStudentDao dao = Mockito.mock(IStudentDao.class);
	StudentService service = new StudentService(dao);

	@Test
	public void StudentAllListCheck() {

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "OBERLE", "François", "françois@yahoo.fr", "Saint cyr 10 rue des fermiers",
				"01 02 03 04 05", new Date()));

		Mockito.when(dao.readAllStudent()).thenReturn(list);

		List<Student> students = service.readAllStudent();

		Assertions.assertEquals(students.get(0).getFirstName(), "OBERLE");
		Mockito.verify(dao).readAllStudent();

	}

	@Test
	public void studentCreationCheck() {

		Student student = new Student(1, "OBERLE", "François", "françois@yahoo.fr", "Saint cyr 10 rue des fermiers",
				"01 02 03 04 05", new Date());

		Mockito.doNothing().when(dao).createStudent(Mockito.isA(Student.class));
		service.createStudent(student);

		Mockito.verify(dao).createStudent(student);
	}

	@Test
	public void studentUpdateCheck() {
		Student student = new Student(1, "OBERLE", "François", "françois@yahoo.fr", "Saint cyr 10 rue des fermiers",
				"01 02 03 04 05", new Date());

		Mockito.doNothing().when(dao).updateStudent(Mockito.isA(Student.class));
		service.updateStudent(student);

		Mockito.verify(dao).updateStudent(student);
	}

	@Test
	public void studentDeleteCheck() {

		Student student = new Student(1, "OBERLE", "François", "françois@yahoo.fr", "Saint cyr 10 rue des fermiers",
				"01 02 03 04 05", new Date());

		Mockito.doNothing().when(dao).deleteStudent(Mockito.isA(Integer.class));
		service.deleteStudent(1);

		Mockito.verify(dao).deleteStudent(1);
	}

	@Test
	public void studentSelectCheck() {

		Student student = new Student(1, "OBERLE", "François", "françois@yahoo.fr", "Saint cyr 10 rue des fermiers",
				"01 02 03 04 05", new Date());

		Mockito.when(dao.getStudent(1)).thenReturn(student);

		Student student1 = service.getStudent(1);

		Assertions.assertEquals(student1.getId(), 1);
		Mockito.verify(dao).getStudent(student.getId());
	}

	@Test
	public void studentCourseCreationCheck() {

		ICourseDao courseDao = Mockito.mock(ICourseDao.class);
		CourseService courseService = new CourseService(courseDao);

		Student student = new Student(1, "OBERLE", "François", "françois@yahoo.fr", "Saint cyr 10 rue des fermiers",
				"01 02 03 04 05", new Date());
		Course course = new Course("JAVA", 40);

		Mockito.doNothing().when(courseDao).associateCourse(Mockito.isA(Course.class), Mockito.isA(Integer.class));
		courseService.associateCourse(course, student.getId());

		Mockito.verify(courseDao).associateCourse(course, student.getId());
	}
	
	@Test
	public void getUserCheck() {

		Student student = new Student(1, "OZDOK", "Bertrand", "ozdok@yahoo.fr", "Saint cyr 10 rue des fermiers",
				"01 02 03 04 05", new Date());

		Mockito.when(dao.getUser("ozdok@yahoo.fr")).thenReturn(student);

		Student student1 = service.getUser("ozdok@yahoo.fr");

		Assertions.assertEquals(student1.getMailAdresse(), "ozdok@yahoo.fr");
		Mockito.verify(dao).getUser("ozdok@yahoo.fr");

	}

}
