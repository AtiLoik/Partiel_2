package com.ensup.master.daoImpl;

import java.util.ArrayList;

import com.ensup.master.metier.Student;

public interface IStudentDao {

	public void createStudent(Student student);
	
	public Student getStudent(int  id);
	
	public Student getUser(String email);
	
	public ArrayList<Student> readAllStudent();
	
	public void deleteStudent(int id);
	
	public void  updateStudent(Student student);
	
	public boolean authentificate(String mail,String psswrd);
}
