var today= new Date();

document.write(today);
document.write("<br>");
document.write(today.getDate());
document.write("<br>");
document.write(today.getDay());
document.write("<br>");
document.write(today.getHours());
document.write("<br>");
document.write(today.getMinutes());
document.write("<br>");
document.write(today.getSeconds());
document.write("<br>");
document.write(today.getTime());
document.write("<br>");
document.write(today.getTimezoneOffset());
document.write("<br>");
document.write(today.getYear());
document.write("<br>");
document.write(today.toDateString());

today.setYear(17);
document.write("<br>");
var tomorrow= new Date(2017, 09, 07, 12, 32, 76, 3200);
document.write(tomorrow);

document.write(today.getMonth()- tomorrow.getMonth());

var date1= new Date("02-21-2017");
var date2= new Date("2017/03/21");
document.write(date1);
document.write("<br>");
document.write(date2);
document.write("<br>");

var date3= new Date("January 23, 2017");
