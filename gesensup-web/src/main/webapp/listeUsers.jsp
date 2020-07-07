<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.ensup.master.metier.Student" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.css">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
		
		<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.js"></script>
		<title>Liste des utilisateurs</title>
	</head>
	<body style="background-color: #eee">
		<div class="container">
		
			<%@include file="menu.jsp" %>
			
			<% ArrayList<Student> listStudent = (ArrayList<Student>) request.getAttribute("students"); %>
			
			<table id="table_id" class="display">
			    <thead>
			        <tr>
			            <th>#ID</th>
			            <th>Prénom</th>
			            <th>Nom</th>
			            <th>Email</th>
			            <th>Adresse</th>
			            <th>Numéro de téléphone</th>
			            <th>Date de naissance</th>
			        </tr>
			    </thead>
			    <tbody>
			    	<% for(Student student : listStudent) { %>
			        <tr>
			            <td><%= student.getId() %></td>
			       		<td><%= student.getLastName() %></td>
			       		<td><%= student.getFirstName() %></td>
			       		<td><%= student.getMailAdresse() %></td>
			       		<td><%= student.getAdress() %></td>
			       		<td><%= student.getNumberPhone() %></td>
			       		<td>Date</td>
			        </tr>
			        <% } %>
			    </tbody>
			</table>
		</div>
	</body>
</html>