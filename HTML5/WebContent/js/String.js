var str= "Payal";
document.write(str.length); //no. of elements

document.write(str.charAt(2)); //char at 2nd index
document.write(str.indexOf('a')); //index from start
document.write(str.lastIndexOf('a')); //index from end
document.write(str.replace('Pay', 'Sej')); //Sejal

document.write(str + " Bansal");
document.write(str.concat(" Bansal", " ,Delhi", " , India"));

document.write(str.substr(0, 2)); //Pa

document.write(str.toUpperCase());
document.write(str.toLowerCase());

document.write(str.bold());
document.write(str.italics());
document.write(str.fontcolor("blue"));
document.write(str.fontsize(7)); //1 to 7
document.write(str.strike());
document.write(str.sub());
document.write(str.sup());
document.write(str.big());
document.write(str.small());

document.write(str.link("http://www.google.com"));
document.write(str.charCodeAt(1)); //unicode of char at this index



