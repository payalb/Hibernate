package com.java.core;

 class MyOuterClass {
	private int a;
	protected int b;
	public int c;
	int d;
	public void printOuter(){
		System.out.println(a+""+b+""+c+""+d);
	}
	class MyInnerClass{
		private int e;
		protected int f;
		public int g;
		int h;
	
		public void printInner(){
			printOuter();
			System.out.println(e+""+f+""+g+""+h);
		}
	}
	
	public static void main(String args[]){
		
		MyOuterClass obj= new MyOuterClass();
		MyOuterClass.MyInnerClass obj1= obj.new MyInnerClass();
		obj1.printInner();
	}
}


