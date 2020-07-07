package com.ensup.master.serviceImpl;

import com.ensup.master.daoImpl.ICourseDao;
import com.ensup.master.metier.Course;
import com.ensup.master.service.ICourseService;

/**
 * Classe CourseService
 * Représente la gestion des cours.
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
	 * @param course Le cours à associer.
	 * @param id L'id de l'étudiant à qui associer le cours.
	 */
	public void associateCourse(Course course, int id) {
		dao.associateCourse(course, id);
	}

}
