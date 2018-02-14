var num= 10;

/*if(num <=10){
	document.write("Number is less than 10");
}*/

/*if(num <= 5){
	document.write("Number is less than or equal to 5");
}else{
	document.write("Number is greater than 5");
}*/

/*if(num <=5){
	document.write("Number is less than or equal to 5");
}
else if(num <= 10){
	document.write("Number is less than or equal to 10");
}
else if(num <=20){
	document.write("Number is less than or equal to 20");
}
else{
	document.write("Number is greater than 20");
}
*/


//logical operators
//logical and operator
var num1= 5;
var num2= 10;
if(num1 >= 5 && ++num2 >10){
	document.write( "In if" + num1 +"" + num2);
}else{
	document.write( "In else" + num1 +"" + num2);
}

//logical or operator
var num1= 5;
var num2= 10;
if(num1 >= 5 || ++num2 >10){
	document.write( "In if" + num1 +"" + num2);
}else{
	document.write( "In else" + num1 +"" + num2);
}

//logical not operator
if(!(num1>5)){
	document.write( "In if" + num1 );
}





num = 3; 
switch(num){

case 'hi': 
	document.write(" value = hi");
	break;
case 1:
case 2:
case 3:
case 4:
case 'hello':
	document.write(" value <5");
	break;
default:
	document.write(" value >= 5");
	//break;
	
}
	


