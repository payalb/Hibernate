//alert("Hello world!");
//Syntax
/*
 function nameOfMethod( parameters){ 
 what it should do
}
*/

function printHello(){
	document.write("Hello <br>");
}

function addNumbers(num1){
	document.write("add called!")
}


printHello();

addNumbers();

var sum = addNumbers(432, 765);
document.write(sum);