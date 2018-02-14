<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<form action="./addUser" method="post">
		<h2 class="TopHeading">
			<b>Company Enrollment Form : </b>
		</h2>
		<br> Kindly fill in the below form to book a training with us.
		Courses available are listed below. <br> <label
			id="hiddenMessage" class="heading"></label><br>

		<table>
			<caption>Form</caption>
			<tbody>
				<tr>
					<td>Full Name:*</td>
					<td class="inputText"><input type="text" name="name" required
						autofocus /></td>
				</tr>
				<tr>
					<td>City:*</td>
					<td class="inputText"><input type="text" name="city" required /></td>
				</tr>
				<tr>
					<td>Phone Number:*</td>
					<td class="inputText"><input type="text" name="phoneNumber"
						required /></td>

				</tr>
				<tr>
					<td>Password:*</td>
					<td class="inputText"><input type="password" name="password"
						required /></td>

				</tr>
				<tr>
					<td>Email id:</td>
					<td class="inputText"><input type="email" name="emailId" /></td>
				</tr>
				<tr>
					<td>Course:</td>
					<td class="inputText"><select multiple="multiple"
						onchange="calculateFees()">
							<c:forEach items="${courses}" var="course">
								<option value="${course}">${course}</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>Company Name:</td>
					<td class="inputText"><input type="text" /></td>
				</tr>
				<tr>
					<td>Course Fee (per day):</td>
					<td class="inputText"><label id="feeDetails">{{user.fees}}</label></td>
				</tr>
				<tr>
					<td>Start Date:</td>
					<td class="inputText"><input type="date"
						placeholder="yyyy-MM-dd" /></td>
				</tr>
				<tr>
					<td>End Date:</td>
					<td class="inputText"><input type="date"
						placeholder="yyyy-MM-dd" /></td>
				</tr>
				<tr>
					<td>Training Mode:</td>
					<td class="inputText"><select>
							<option value="classroom" selected="selected">Classroom</option>
							<option value="online">Online</option>
					</select></td>
				</tr>
				<tr>
					<td>Tell us your expectations:</td>
					<td class="inputText"><textarea rows="5" cols="1"
							placeholder="Tell us any other training requirement.."></textarea></td>

				</tr>
				<tr></tr>
				<tr>
					<td></td>
					<td class="inputText"><input type="submit" value="Contact Me!" /></td>
				</tr>
			</tbody>

		</table>
	</form>
</body>
</html>