package com.java.innerclass;

public class NonStaticDemo {
	
	public int a=5;
	
	class InnerOne{
		public void print(){
			System.out.println("Am Inner"+ a);
		}
	}

	public static void main(String[] args) {
		NonStaticDemo obj= new NonStaticDemo();
		NonStaticDemo.InnerOne objInner=  obj.new InnerOne();
		objInner.print();
	}

}
