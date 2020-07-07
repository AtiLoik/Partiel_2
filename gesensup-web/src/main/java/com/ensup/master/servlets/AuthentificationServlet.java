package com.ensup.master.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthentificationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AuthentificationServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String login = request.getParameter("login");
//		String password = request.getParameter("password");
//		
//		RequestDispatcher dispatcher;
//		ServiceGestion auth = new ServiceGestion();
//		
//		if(auth.authentificate(login, password)) {
//			User user = auth.getUser(login);
//			HttpSession session = request.getSession();
//			session.setAttribute("utilisateur", user);
//			dispatcher = request.getRequestDispatcher("accueil.jsp");
//		}else {
//			dispatcher = request.getRequestDispatcher("login.html");
//		}
//		
//		dispatcher.forward(request, response);
	}
}
