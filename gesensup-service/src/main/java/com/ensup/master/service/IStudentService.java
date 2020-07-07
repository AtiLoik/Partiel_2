package com.ensup.master.service;

import java.util.List;

import com.ensup.master.daoImpl.IStudentDao;
import com.ensup.master.metier.Student;

/**
 * Interface contractant les méthodes qui concerne les Student.
 * @author M1 ED2O
 *
 */
public interface IStudentService  {
	
	public void  StudentService(IStudentDao dao);
	
	
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
	
	public boolean authentification(String login,String pwd);

}
