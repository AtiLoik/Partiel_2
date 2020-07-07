package com.ensup.master.service;

import com.ensup.master.dao.ICourseDao;
import com.ensup.master.metier.Course;
import com.ensup.master.serviceImpl.ICourseService;

/**
 * CourseService
 * 
 * @author DANON
 *
 */
public class CourseService implements ICourseService {

	ICourseDao dao;
	
	public CourseService(ICourseDao dao) {
		this.dao = dao;
	}

	/**
	 * associate course 
	 * @param course
	 * @param id
	 */
	public void associateCourse(Course course, int id) {
		dao.associateCourse(course, id);
	}

}
