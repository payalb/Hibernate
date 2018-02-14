package com.java;

public class InnerClassOne {

	static class A {
		// Inner class
		private int x = 10;

		static class B {
			private int y = 2;

			public void print() {
				System.out.println( y);
			}

		}
	}
}

class MyClass2 {
	public static void main(String args[]) {
		InnerClassOne.A.B obj = new InnerClassOne.A.B();
		obj.print();
	}
}