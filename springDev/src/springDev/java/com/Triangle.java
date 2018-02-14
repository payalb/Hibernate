package springDev.java.com;

public class Triangle implements Shape {
	
	public Triangle(String name, int length){
		this.name= name;
		this.length= length;
	}
	private String name;
	private int length;

	public int getLength() {
		return length;
	}

	public void draw() {
		System.out.println("Drawing a "+ name+ " triangle!! Length is "+ length);

	}
@Override
	public String toString() {
		return "i am "+ name+ " triangle!! Length is "+ length;

	}

}
