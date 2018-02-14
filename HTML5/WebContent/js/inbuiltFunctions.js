var num1= 5;  //global variable



function printValue1(num3){
	num3= num3+ num1;
	document.write(num3); //error
}


//printValue();
var str= "Payal";
printValue1(str);
document.write(str);

/*printValue();

function printValue(){
	var num1=10;
	var num2= 10; //local variable
	num3= 25; //global variable
	document.write("doing");//10
	document.write(window.num1);//5
}
*/