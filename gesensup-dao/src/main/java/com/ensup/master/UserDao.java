package com.ensup.master;

import java.util.ArrayList;



public interface UserDao {
	public void createStudent(String name, String first_name,String adresse, String adresse_mail, String phone_number,String birth,String type);
	public boolean getUser(String login, String mdp);
	public Student getUser(String login);
	public ArrayList<Student> getAllUser();
	public void deleteStudent(String mail);
	public void updateStudent(String last_mail, String name, String first_name, String new_mail, String phone_number,String birth,String adresse,String type);


}
