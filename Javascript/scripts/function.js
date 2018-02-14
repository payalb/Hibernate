/*function hoisting*/
document.write(add(3,4));

/*named function declaration*/
function add(a,b){
	return a+b;
}

/*anonymous function expression*/
var  add1= function(a,b){
	return a+b;
}
/*hoisting does not work for function expression*/
var sum= add1(6,4);
document.write(sum);


/*named function expression declaration*/
var fact=function factorial(a){
	if(a<=1){
		return 1;
	}
	/*factorial name can be used only internally*/
	return a*factorial(a-1);
}
/*to call the function outside, cannot use factorial*/
document.write(fact(5));

/*Passing value for parameter*/
var fact1=(function factorial1(a){
	if(a<=1){
		return 1;
	}
	return a*factorial1(a-1);
}(5));

document.write(fact1);
/*output:120*/

document.write("global/local variables<br>")

function mul(a, b){
	/*a,b are local variables*/
	return a*b;
}

/*a not accessible outside*/
/*document.write(a+"<br>");*/

var sum=1;
/*global variable*/
mul(3,4);
function mul(a, b){
	//since declared without var keyword, is global.
	 sum= a*b;
	 //variable hoisting: moved to top of function as local. Only declaration.
	 //Not value
	 var sum=0; 
}

if(sum>0)
{
	//global variable.
	var div= 45;
}

document.write(div+"<br>");
/*output: 45*/

/*Can be accessed outside*/
document.write(sum+"<br>");
/*output: 1*/