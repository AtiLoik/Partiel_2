/**
 * Classe inscription servlet du projet Formulaire Java JSP Servlet
 * 
 * @author Master 1 ED2O
 * @version 0.0.1
 */
package com.ensup.master.servlets;

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
import javax.servlet.http.HttpSession;

import com.ensup.master.dao.StudentDao;
import com.ensup.master.metier.Student;
import com.ensup.master.serviceImpl.StudentService;


/**
 * Servlet implementation class InscriptionServlet
 */
@WebServlet("/InscriptionServlet")
public class InscriptionServlet extends HttpServlet {
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscriptionServlet() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("name");
		String prenom = request.getParameter("firstname");
		String email = request.getParameter("email");
		String adresse = request.getParameter("adress");
		String telephone = request.getParameter("phone");
		String date = request.getParameter("birthday");
		//Date date1=null;
//		try {
//			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}		
		
		StudentDao dao = new StudentDao();
		RequestDispatcher dispatcher;
		StudentService ss = new StudentService(dao);
		Student student = new Student(0,prenom,nom,email,adresse,telephone,date);
		ss.createStudent(student);
		HttpSession session = request.getSession();
		dispatcher = request.getRequestDispatcher("home.jsp");
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
