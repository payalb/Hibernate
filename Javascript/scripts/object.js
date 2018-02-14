var var1 = {};

var book = {
	title : 'Head first java',
	price : 200,
	keywords : {
		keyword1 : 'java',
		keyword2 : 'programming language'
	}
};

document.write(book.keywords.keyword2 + "<br>")

delete book.keywords;

document.write(book.keywords + "<br>")
/* property is any variable. */
for (property in book) {
	document.write(property + ": &nbsp;" + book[property] + "-" + book.property
			+ "<br>");
}

/* Using new keyword */
var var2 = new Object();
var date = new Date();
document.write(date + "<br>");
