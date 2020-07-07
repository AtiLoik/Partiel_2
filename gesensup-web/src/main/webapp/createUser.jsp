<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html style="height:100%">
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.1/css/all.min.css">
		<title>Créer un étudiant</title>
	</head>
	<body style="background-color: #eee; height: inherit">
		<div class="container" style="background-color: #fff; padding: 0; padding-bottom: 20px; height: inherit">
		
			<%@include file="menu.jsp" %>
			
			<form class="mb-0" method="POST" action="">
				<div class="card shadow mt-5" style="width: 50%; margin: auto">
					<div class="card-header text-light bg-primary mb-0">
						<h1 class="card-title mb-0" style="font-size: 150%;"><i class="fas fa-user-plus"></i> Création un nouvel élève</h1>
					</div>
					<div class="card-body">
						<div class="card-title">
							<div class="row">
								<div class="col">
									<div class="form-group">
										<small class="form-text text-muted">Prénom de l'élève</small>
										<input class="form-control" type="text" name="firstName" required>
									</div>
								</div>
								<div class="col">
									<div class="form-group">
										<small class="form-text text-muted">Nom de l'élève</small>
										<input class="form-control" type="text" name="name" required>
									</div>
								</div>
							</div>
							<div class="form-group">
								<small class="form-text text-muted">Email de l'élève</small>
								<input class="form-control" type="email" name="email" required>
							</div>
							<div class="form-group">
								<small class="form-text text-muted">Adresse de l'élève</small>
								<input class="form-control" type="text" name="adress" maxlength="12" required>
							</div>
							<div class="form-group">
								<small class="form-text text-muted">Téléphone de l'élève</small>
								<input class="form-control" type="text" name="phone" pattern="^(?:0|\(?\+33\)?\s?|0033\s?)[1-79](?:[\.\-\s]?\d\d){4}$" title="Numéro de téléphone" required>
							</div>
							<div class="form-group">
								<small class="form-text text-muted">Date de naissance de l'élève</small>
								<input class="form-control" type="date" name="birthday" required>
							</div>
						</div>
					</div>
					<div class="card-footer">
						<input class="btn btn-success" type="submit" value="Me connecter">
					</div>
				</div>
			</form>
		</div>
		<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.1/js/all.min.js"></script>
	</body>
</html>