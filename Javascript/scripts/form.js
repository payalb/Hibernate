function validateForm() {
	var ret = true;
	var username = document.getElementById("username").value;
	var nameLabel = document.getElementById("nameLabel");
	var password = document.getElementById("password").value;
	var password1 = document.getElementById("password1").value;
	var passLabel = document.getElementById("passwordLabel");
	var pass1Label = document.getElementById("password1Label");
	var email = document.getElementById("email").value;
	var emailLabel = document.getElementById("emailLabel");
	var tel = document.getElementById("tel").value;
	var telLabel = document.getElementById("telLabel");

	document.write(document.getElementsByName("c1")[0]);
	if (!isAlphateic(username)) {
		nameLabel.innerHTML = "Please enter a valid username";
		document.getElementById("username").focus();
		ret = false;
	}
	if (password == "" || password.length <5) {
		passLabel.innerHTML = "Invalid password";
		var password = document.getElementById("password");
		password.focus();
		password.style.border = "2px solid red";
		ret = false;
	}
	if (password1 == "") {
		pass1Label.innerHTML = "Please renter the password.";
		ret = false;
	}
	if (email == "") {
		emailLabel.innerHTML = "Email ID is required.";
		ret = false;
	}
	if (!isValidTel(tel)) {
		telLabel.innerHTML = "Please enter a valid phone number.";
		ret = false;
	}
	
	if(ret == true){
		var choice= confirm("Are you sure?");
		if(choice){
			ret= true;
		}else{
			ret= false;
		}
		
	}
	return ret;
}

function isAlphateic(field){
	var letters = /^[A-Za-z]+$/;
	return field.match(letters)
}

function isValidTel(tel){
	var pattern = /^[+]{0,1}[0-9]{0,2}[-]?[0-9]+$/;
	return tel.match(pattern)
}