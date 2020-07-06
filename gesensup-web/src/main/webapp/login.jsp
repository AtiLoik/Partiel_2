<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
		<title>Connexion</title>
	</head>
	<body style="background-color: #eee">
		<div class="container">
			<div class="card shadow mt-5 text-center" style="width: 30%; margin: auto">
				<div class="card-body">
					<div class="card-title">
						<h1 class="card-title">Connexion</h1>
						<hr>
						<form class="mb-0" method="POST" action="">
							<div class="form-group">
								<small class="form-text text-muted" style="float: left">Votre email</small>
								<input class="form-control" type="text" name="login">
							</div>
							<div class="form-group">
								<small class="form-text text-muted" style="float: left">Votre mot de passe</small>
								<input class="form-control" type="password" name="password">
							</div>
							<input class="btn btn-success" type="submit" value="Me connecter">
						</form>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>