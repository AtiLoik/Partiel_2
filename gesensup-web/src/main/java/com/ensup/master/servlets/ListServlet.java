package com.ensup.master.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

@WebServlet("/ListServlet")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public ListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("**********************************************************************************************************************************************************************************************");
		
		RequestDispatcher dispatcher;
		List<Student> listStudents = new ArrayList<Student>();
		HttpSession session = request.getSession();
		StudentDao dao =new StudentDao();
		StudentService auth = new StudentService(dao);
		
		listStudents = auth.readAllStudent();
		request.setAttribute("students", listStudents);
		//session.setAttribute("students", listStudents);
		
		this.getServletContext().getRequestDispatcher( "listeUsers.jsp" ).forward( request, response );
		
//		dispatcher = request.getRequestDispatcher("listeUsers.jsp");
//		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
