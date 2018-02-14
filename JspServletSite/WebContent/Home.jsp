<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html >
<head>
<meta charset="ISO-8859-1">
<title>JLearning</title>

<script>
	document.write('<base href="' + document.location + '" />');
</script>

<link href="css/style.css" rel="stylesheet">
<script type="text/javascript" src="scripts/websiteHome.js"></script>
</head>
<body>
	<header>
	<h1 >Bansal Institute Java/J2ee</h1>
		<div id="login">
			<nav>
				<ul>
					<li><a href="Home.jsp">Home Page</a></li>
					<li><a href="./Login.jsp">Login</a></li>
					<li><a href="signUp">SignUp</a></li>
				</ul>
			</nav>
		</div>
		<div class="clear"></div>
	</header>
	<aside>
		<nav>
			<div id="nav">
				<a href="OnlineTrainingForm"><img
					src="images/OnlineTraining.jpg" class="image"
					title="Online Trainings"> </a> <a href="ClassroomTrainingForm"><img
					src="images/ClassroomTraining.jpg" class="image"
					title="Classroom Trainings"></a> <a href="Projects"><img
					src="images/Projects.png" class="image" title="Buy a Project"></a>
				<a href="Syllabus"><img src="images/Syllabus.jpg" class="image"
					title="Syllabus"></a> <a href="SM"> <img src="images/SM.jpg"
					class="image" title="Tutorials"></a> <a href="PracticeQuestion"><img
					src="images/PracticeQuestion.jpg" class="image"
					title="Practice Questions"></a> <a href="ContactUs"><img
					src="images/ContactUs.jpg" class="image" title="Contact Us"></a>
			</div>
		</nav>
	</aside>
	<section>
		<div id="main">
		</div>
	</section>
	<footer>
		<div>
			<b>Contact us for more details!!</b>
		</div>

		<marquee>Click on above images to navigate through the site!</marquee>
	</footer>
</body>
</html>