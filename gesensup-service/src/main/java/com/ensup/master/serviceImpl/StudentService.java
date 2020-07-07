package com.ensup.master.serviceImpl;

import java.util.List;

import com.ensup.master.dao.IStudentDao;
import com.ensup.master.metier.Student;

/**
 * StudentService
 * 
 * @author DANON
 *
 */
public class StudentService {

	IStudentDao dao;
	
	public StudentService(IStudentDao dao) {
		this.dao = dao;
	}
	
	public void createStudent(Student student) {
		dao.createStudent(student);
	}

	/**
	 * Read all informations of all students
	 * @return List<Student>
	 */
	 
	public List<Student> readAllStudent() {
		return dao.readAllStudent();
	}

	/**
	 * Upadate a student information
	 * @param student
	 */
	public void updateStudent(Student student) {
		dao.updateStudent(student);
	}

	/**	
	 * delete a student information
	 * @param i
	 */
	public void deleteStudent(int id) {
		dao.deleteStudent(id);		
	}

	/**
	 * get a student information
	 * @param student
	 * @return
	 */
	public Student getStudent(int i) {
		// TODO Auto-generated method stub
		return dao.getStudent(i);
	}

	/**
	 * get user
	 * @param email
	 * @return
	 */
	public Student getUser(String email) {
		
		return dao.getUser(email);
	}
}
