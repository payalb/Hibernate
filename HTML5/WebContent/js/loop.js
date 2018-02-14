//loops

//1) while loop

document.write("<h1>Table of 19 </h1>");
var num= 1;
while(true){
	document.write("19 * "+ num + " = "+ (19*num) + "<br>");
	num++;
	if(num <=10){
		break;
	}
}

//2) for loop

/*for(initialization; condition; operation){
	
}*/
document.write("<h1>Table of 19 </h1>");
for(var num =1; num <=10; num++){
	if( num == 5){
		continue;
	}
	document.write("19 * "+ num + " = "+ (19*num) + "<br>");
}







