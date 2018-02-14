var student={
	name: "Payal",
	marks : 23,
	
	printNumber: function(){
		document.write("Printing.."+ this.name+ "..");
	}
	
};

document.write(student.name);
delete student.name; //delete a property
document.write(student.name);
student.address = "10R"; //add a new property
student.printNumber();

document.write(student.address);