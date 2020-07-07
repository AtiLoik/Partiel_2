package com.ensup.master.serviceImpl;

import java.util.List;

import com.ensup.master.service.IStudentDao;
import com.ensup.master.service.Student;

public interface IStudentService {
	
	public StudentService(IStudentDao dao);
	
	
	public void createStudent(Student student) ;

	/**
	 * Read all informations of all students
	 * @return List<Student>
	 */
	 
	public List<Student> readAllStudent() ;
	/**
	 * Upadate a student information
	 * @param student
	 */
	public void updateStudent(Student student);

	/**	
	 * delete a student information
	 * @param i
	 */
	public void deleteStudent(int id) ;

	/**
	 * get a student information
	 * @param student
	 * @return
	 */
	public Student getStudent(int i) ;

	/**
	 * get user
	 * @param email
	 * @return
	 */
	public Student getUser(String email);

}
