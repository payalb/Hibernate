var heading = document.querySelector('h1');
heading.innerHTML = 'Hello World!';
var variableOne = 10;
document.write(variableOne);
document.querySelector('h2').onclick = function() {
	alert("clicked!");
}

var imageFile = document.querySelector('img');

imageFile.onclick = function() {
	var imageSource = imageFile.getAttribute('src');
	if (imageSource === "C:\\Users\\Dell\\workspace\\Javascript\\Desert.jpg") {
		imageFile.setAttribute('src',
				"C:\\Users\\Dell\\workspace\\Javascript\\Chrysanthemum.jpg");
	} else {
		imageFile.setAttribute('src',
				"C:\\Users\\Dell\\workspace\\Javascript\\Desert.jpg");
	}
}
 

var myButton= document.querySelector('button');
myButton.addEventListener("click", changeUser, false);

function changeUser(){
	//defining object in js
	var student= {
		name: 'Payal',
		age: 32,
		'is studying': 'false'
	}

	student.isAdmin= true;
	
	alert(student.name);
	alert(student.isAdmin);
	delete(student.age);
	student["is Working"]= false;
	alert(student["is Working"]);
	alert(student['is studying']);
	var name= prompt("Please enter your name", "Default value");
	alert(name);
	alert(typeof student);
	alert(typeof student.name);
	if(typeof student == "object"){
		alert("is object");
	}
		if(typeof student.name == "string"){
			alert("is string");
	}
}

function add(num1, num2) {
	return num1 + num2;
}

function validateForm(){
	var ret= true;
	if(document.getElementById("name").value=""){
		document.getElementById("name").innerText="First name is required.";
		ret= false;
	}
}