package springDev.java.com;

public class ConstrInjection {
	
	private String name;
	private int age;
	
	/*
	 * Spring creates object using default constructor. Else constructor not found exception.
	 * By default, calls String constructor.
	 */
	ConstrInjection(String name){
		this.name= name;
	}

	ConstrInjection(int  age){
		this.age= age;
	}
	
	ConstrInjection(String name, int age){
		this.name= name;
		this.age= age;
	}
	
	
	
	public void printName(){
		System.out.println("name is " +name);
		System.out.println("age is "+ age);
	}
}
