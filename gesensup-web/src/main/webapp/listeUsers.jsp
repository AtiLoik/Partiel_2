<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
			        <tr>
			            <td>Row 1 Data 1</td>
			            <td>Row 1 Data 2</td>
			        </tr>
			    </tbody>
			</table>
			
			
		</div>
	</body>
</html>