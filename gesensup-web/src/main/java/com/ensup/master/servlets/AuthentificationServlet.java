/**
 * Classe authentification servlet du projet Formulaire Java JSP Servlet
 * 
 * @author Master 1 ED2O
 * @version 0.0.1
 */
package com.ensup.master.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ensup.master.dao.StudentDao;
import com.ensup.master.daoImpl.IStudentDao;
import com.ensup.master.metier.Student;
import com.ensup.master.serviceImpl.StudentService;

/**
 * Servlet implementation class AuthentificationServlet
 */
@WebServlet("/AuthentificationServlet")
/*
 * Servlet servant à authentifier un utilisateur.
 * @author Benjy
 *
 */
public class AuthentificationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthentificationServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		RequestDispatcher dispatcher;
		StudentDao dao =new StudentDao();
		StudentService auth = new StudentService(dao);
		
		if(auth.authentification(login, password)) {
			Student user = auth.getUser(login);
			HttpSession session = request.getSession();
			session.setAttribute("utilisateur", user);
			dispatcher = request.getRequestDispatcher("home.jsp");
		}else {
			dispatcher = request.getRequestDispatcher("login.jsp");
		}
		
		dispatcher.forward(request, response);
	}
}
