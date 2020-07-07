package com.ensup.master.daoImpl;

import com.ensup.master.metier.Course;

/**
 * Interface CourseDao
 * 
 * @author DANON
 *
 */
public interface ICourseDao {

	public void associateCourse(Course course,int id);
}
