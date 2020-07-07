package com.objis.gestionformationssession.presentation.servlet;

//Classe update servlet du projet Formulaire Java JSP Servlet
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.objis.gestionformationssession.dao.UserDAO;
import com.objis.gestionformationssession.service.ServiceGestion;

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
		String l_email = request.getParameter("l_email");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String mdp = request.getParameter("mdp");
		RequestDispatcher dispatcher;
		ServiceGestion serviceGestion = new ServiceGestion();
		serviceGestion.update(l_email,nom, prenom, email, mdp);
		dispatcher = request.getRequestDispatcher("accueil.jsp");
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
