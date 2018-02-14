// access elements by tag names && change the text
var paragraph1= document.getElementsByTagName("p");

paragraph1[0].innerHTML = "Hello World!";
paragraph1[1].innerHTML = "Hello World!";
paragraph1[2].innerHTML = "Hello World!";

var heading1= document.getElementsByTagName("h1");
heading1[0].innerHTML= "New heading!";



var paragraph4= document.getElementById("p1");
paragraph4.innerHTML= "Diff text!";

var elements= document.getElementsByClassName("class1");

for(var i= 0; i< elements.length; i++){
	elements[i].innerHTML= "Diff class!";
}
//Id , class, Tag name 

var elements1= document.getElementsByName("country");

elements1[0].value;