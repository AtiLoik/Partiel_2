package com.ensup.master.service;

import com.ensup.master.metier.Course;

/**
 * Interface contractant les méthodes qui concerne les Course.
 * @author M1 ED2O
 *
 */
public interface ICourseService{
	public void associateCourse(Course course, int id);
	
}
