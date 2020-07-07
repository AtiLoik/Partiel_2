package com.ensup.master.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.ensup.master.daoImpl.ICourseDao;
import com.ensup.master.daoImpl.IStudentDao;
import com.ensup.master.metier.Course;

public class CourseDao implements ICourseDao {

	
	private String url = "jdbc:mysql://dougschool.instrurap.fr/dougschool?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private String sql_login = "app";
	private String sql_password = "app";
	
//	private String url = "jdbc:mysql://localhost/dougschool?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//	private String sql_login = "app";
//	private String sql_password = "app";
	
	
	/**
	 * associate course 
	 * @param course
	 * @param id
	 */
	public void associateCourse(Course course,int id) {
		
		Connection cn = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection(url, sql_login, sql_password);
			
			st = cn.createStatement();
			
			String sql = "INSERT INTO ds_users_students (user_id, current_classes_name) VALUES ('"+ id +"', '"+course.getThemeCourse() +"')";
		
			st.executeUpdate(sql);
			System.out.println("Cours associé");
			cn.close();
			st.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
}
