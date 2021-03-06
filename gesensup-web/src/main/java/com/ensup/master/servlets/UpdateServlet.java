package com.ensup.master.servlets;

//Classe update servlet du projet Formulaire Java JSP Servlet
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ensup.master.dao.StudentDao;
import com.ensup.master.metier.Student;
import com.ensup.master.serviceImpl.StudentService;


/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();    
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("name");
		int id = Integer.parseInt(request.getParameter("id"));
		String prenom = request.getParameter("firstname");
		String email = request.getParameter("email");
		String adresse = request.getParameter("adress");
		String telephone = request.getParameter("phone");
		String date = request.getParameter("birthday");
		Date date1=null;
		try {
			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
		StudentDao dao =new StudentDao();
		RequestDispatcher dispatcher;
		StudentService studentService = new StudentService(dao);
		Student student = new Student(id,prenom,nom,email,adresse,telephone,date1);
		studentService.updateStudent(student);
		dispatcher = request.getRequestDispatcher("listeUsers.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
