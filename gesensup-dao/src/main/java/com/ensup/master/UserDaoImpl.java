package com.ensup.master;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class UserDaoImpl implements UserDao{
	private DaoFactory daoFactory;
	UserDaoImpl(DaoFactory daoFactory){
	this.daoFactory=daoFactory;}
public UserDaoImpl() {
		// TODO Auto-generated constructor stub
	}
@Override
public void createStudent( String name, String first_name, String adresse, String adresse_mail,
		String phone_number, String birth,String type) {
	Connection connexion=null;
	PreparedStatement preparedStatement=null;
		try {
			connexion=daoFactory.getConnection();
			preparedStatement=connexion.prepareStatement("INSERT INTO ds_users (user_lastname, user_firstname, "
					+ "user_email,user_adresse,user_phone,user_birthdate,user_type) VALUES (?,?,?,?,?,?,?);");
		preparedStatement.setString(1,name);
		preparedStatement.setString(2,first_name);
		preparedStatement.setString(3,adresse_mail);
		preparedStatement.setString(4,adresse);
		preparedStatement.setString(5,phone_number);
		preparedStatement.setString(6,birth);
		preparedStatement.setString(7,type);
		preparedStatement.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	// TODO Auto-generated method stub
	
}
@Override
public boolean getUser(String login, String mdp) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public Student getUser(String login) {
	
	Connection connexion=null;
	ResultSet rs = null;
	PreparedStatement preparedStatement=null;
		try {
			
			connexion=daoFactory.getConnection();
			preparedStatement=connexion.prepareStatement("SELECT * FROM ds_users WHERE user_email = ?");
			preparedStatement.setString(1,login);
			rs = preparedStatement.executeQuery();
			if(rs.next()) {
				return new Student(rs.getInt("user_id"), rs.getString("user_last_name"), rs.getString("user_firstname"), rs.getString("user_email"),
						rs.getString("user_adress"),rs.getInt("user_phone"), rs.getString("user_birthdate"),rs.getString("user_type"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	// TODO Auto-generated method stub
	return null;
}
@Override
public ArrayList<Student> getAllUser() {
	Connection connexion=null;
	ResultSet rs = null;
	PreparedStatement preparedStatement=null;
	ArrayList<Student> students = new ArrayList<Student>();
	try {
		connexion=daoFactory.getConnection();
		preparedStatement=connexion.prepareStatement("SELECT * FROM ds_users");
		rs = preparedStatement.executeQuery();
		
		while(rs.next()) {
			students.add(new Student(rs.getInt("user_id"), rs.getString("user_lastname"),
					rs.getString("user_firstname"), rs.getString("user_email"), rs.getString("user_adress"),rs.getInt("user_phone"),
					rs.getString("user_birthdate"), rs.getString("user_type")));
		}
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
	// TODO Auto-generated method stub
	return students;
}
@Override
public void deleteStudent(String mail) {
	Connection connexion=null;
	PreparedStatement preparedStatement=null;
		try {
			connexion=daoFactory.getConnection();
			preparedStatement=connexion.prepareStatement("DELETE FROM ds_users WHERE users_email = ?;");
			preparedStatement.setString(1,mail);
			preparedStatement.executeUpdate();
			}catch(SQLException e) {
			e.printStackTrace();
		}
}
@Override
public void updateStudent(String last_mail, String name, String first_name, String new_mail, String phone_number,String birth,
		String adresse,String type) {
	Connection connexion=null;
	PreparedStatement preparedStatement=null;
		try {
			connexion=daoFactory.getConnection();
			preparedStatement=connexion.prepareStatement("UPDATE ds_users SET user_lastname=?,"
					+ " user_firstname=?, user_email=?, user_adress=?,user_phone=?,user_birthdate=?,user_type=?  WHERE user_email = ?");
			preparedStatement.setString(1,name);
			preparedStatement.setString(2,first_name);
			preparedStatement.setString(3,new_mail);
			preparedStatement.setString(4,adresse);
			preparedStatement.setString(5,phone_number);
			preparedStatement.setString(6,birth);
			preparedStatement.setString(7,type);
			preparedStatement.setString(8,last_mail);
			preparedStatement.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}

}
}
