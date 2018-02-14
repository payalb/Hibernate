package com.java.interface1;

public interface CalculatorInt2 {
	
	public void fact(int num1);
	default public void mod( int num1, int num2){
		System.out.println(  num2%num1);
	}
	
/*	static public void  printNumbers(int number){
		System.out.println(number);
	}*/
}
