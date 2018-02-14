<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the shopping site!</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<script src="bootstrap/js/jquery-3.2.1.js"></script>
	<script src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<ul class="nav nav-tabs">
				<li><a href="login.html">Login</a></li>
				<li ><a href="./register.jsp"><span class="glyphicon glyphicon-home"></span>Registration Form</a></li>
				<li><a href="addUser"><span class="glyphicon glyphicon-earphone"></span>Contact
						Us</a></li>

			</ul>
		</div>
	</div>
	<script>
		$('.nav li a').click(function(e){
			var $this = $(this);
			  if (!$this.hasClass('active')) {
			    $this.addClass('active');
			  }

		});
	</script>
</body>
</html>