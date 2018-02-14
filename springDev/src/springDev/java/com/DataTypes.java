package springDev.java.com;

import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class DataTypes {

	private Circle circle;
	private String name;
	private Triangle[] triangle;
	private String[] intArray;
	private Vector<String> vector;	
	private TreeSet<String> set;
	private Properties driver;
	
	public void setDriver(Properties driver) {
		this.driver = driver;
	}

	public void setVector(Vector<String> vector) {
		this.vector = vector;
	}

	public void setSet(TreeSet<String> set) {
		this.set = set;
	}



	public Triangle[] getTriangle() {
		return triangle;
	}

	public String[] getIntArray() {
		return intArray;
	}

	public void setTriangle(Triangle[] triangle) {
		this.triangle = triangle;
	}

	public void setIntArray(String[] intArray) {
		this.intArray = intArray;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void hello(String string) {
		System.out.println(this.circle + ", " + this.name + " from " + string);
		this.printArray();
		this.printTriangles();

	}
	
	public void hello1(String string) {
		System.out.println(this.circle + ", " + this.name + " from " + string);
		this.printVector();
		this.printSet();
		printDriver();
	}

	private void printSet() {
		for(String setobj	: set){
	System.out.println(setobj);
}
	}

	private void printVector() {
for(String obj: vector){
	System.out.println(obj);
}
	}

	private void printTriangles() {
		for (Triangle triangle : getTriangle()) {
			System.out.println(triangle);
		}
	}

	private void printArray() {
		// TODO Auto-generated method stub
		for (String str : getIntArray()) {
			System.out.println(str);
		}
	}

	private void printDriver(){
		Set keys= driver.keySet();
		for(Object key: keys){
			System.out.println(key);
		}
	}
}
