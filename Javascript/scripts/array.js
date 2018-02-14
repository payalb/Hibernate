function isGreaterThan15(value, index, array){
		return value>15;
}


var subjects=["hindi","english", "history", "maths"];
document.write("In reverse order:")
subjects.reverse();
document.writeln(subjects+"<br>");

subjects.sort();
document.writeln(subjects);

var marks= new Array(20,30,10,15);
document.writeln(marks.sort());

/*Sort works well for string, not for numbers*/
 marks= new Array(20.54,30.32,10.54,15.76);
document.writeln(marks.sort());

/*reverse order*/
document.writeln(marks.reverse());

/*writing the compare method*/
marks=[32,1,43,2,65];
marks.sort(function(a,b){
	return b-a;
})
document.writeln(marks+"<br>");

/*splice method*/
document.writeln("splice result");
marks=[32,1,43,2,65];
marks.splice(2, 2);
document.writeln(marks+"<br>");
marks=[32,1,43,2,65];
marks.splice(2, 0, 31, 65);
document.writeln(marks+"<br>");

marks[2]= null;
document.writeln(marks+"<br>");

/*filters*/
document.writeln("filter1 result");
var temp=[32,54,1,3];
var result1= temp.filter(function(value, index, array){
	return value>15;
});
document.writeln(result1+"<br>");

document.writeln("filter result");
var result= marks.filter(isGreaterThan15);
document.write(result+"<br>");


document.writeln("filter remove duplicates result: ");
var temp=["hgfdf", "sdfdsf","ytytyt","ewrte","ewrte"];
var temp1=temp.filter(function(value, index, array){
	return array.indexOf(value)== index;
});
document.write(temp1+"<br>");

/*Multi-dimensional arrays*/
document.write("Multidiemnsional eg: <br>")
var mark=new Array(3);
for(var i=0; i<=2; i++){
	mark[i]= new Array(2);
	for(var j=0; j<2;j++){
		mark[i][j]= i+ j;
	}
	document.write("<br>")
}

/*forEach method*/
mark.forEach(function(value){
	document.write(value +"<br>");
})

/*map*/
var tmp1=[1,3,5];
var tmp=tmp1.map(function(value){
	return value*5;
})
/*forEach method*/
tmp.forEach(function(value){
	document.write(value +"<br>");
})

var tmp1=[1,3,5];
/*every*/
var res=tmp1.every(function(value){
	return value>1;
});
document.write(res);
/*some*/
res=tmp1.some(function(value){
	return value>1;
});
document.write(res+"<br>");

/*reduce */
var tmp2= [1,3,5,7];
document.write(tmp2.reduce(function(x,y){
	return x+y;
}))
document.write("<br>");

var tmp2= [1,3,5,7];
document.write(tmp2.reduceRight(function(x,y){
	document.write(x+y+"<br>");
	return x+y;
}))

