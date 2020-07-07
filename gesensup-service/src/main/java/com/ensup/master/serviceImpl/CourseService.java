package com.ensup.master.serviceImpl;

import com.ensup.master.dao.ICourseDao;
import com.ensup.master.metier.Course;

/**
 * CourseService
 * 
 * @author DANON
 *
 */
public class CourseService {

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
