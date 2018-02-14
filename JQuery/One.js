var myArr=["One", 23.5];
myArr[2]= "three";
myArr[3]=56;
myArr.splice(2,1 , "test","say");
document.write(myArr.toString());
add(3,4);

function add( num1,  num2){
	alert( num1+ num2);
	var date= new Date();
	date.setTime(date.getTime()+ (5*24*60*60*1000))
	document.cookie= "name=Payal; password=Shreya; expires="+ date.toLocaleDateString();
	var cookieArr= document.cookie.split(";");
	for(var index=0; index< cookieArr.length; index++){
		document.write(cookieArr[index]);
	}
	
}