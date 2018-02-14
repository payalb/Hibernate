var books = ["Java","JSP","Javascript"];

document.write(books[0]);

books[1]= "HTML";

// Java HTML Javascript

document.write(books);

for(var i= 0; i< books.length; i++){
	document.write(books[i]);
}

//1. dynamic: size can be changed

books[5]= "CSS";
document.write(books.length);
document.write(books);

document.write(typeof books);
//2: Inbuilt function 

document.write(books.join(","));

document.write(books.slice(0,2));

document.write(books.concat(["PHP"]));

document.write(books.reverse());

document.write(books.sort());
