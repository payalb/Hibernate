package com.java;

/*instance variables are not overriden in sub-class. inheritence and polymorphism does'nt apply for instance fields. 
 * they are only visible in your sub-class if they are marked protected or public */
public class VariableInheritance {
	int x = 4;

	public void display() {
		System.out.println(x);
		display1();
	}
	public void display1() {
		System.out.println("In VI");
	}

	public static void main(String[] args) {
		XYZ obj = new XYZ();
		System.out.println(obj.x);
		obj.display();

	}

}

class XYZ extends VariableInheritance {
	int x = 5;
	public void display1() {
		System.out.println("In XYZ");
	}
}