package com.java.interface1;

public interface CalculatorInt {
	
	public int add( int num1, int num2);
	public int sub( int num1, int num2);
	public int mul( int num1, int num2);
	public int div( int num1, int num2);
	
	static public void  printNumbers(int number){
		System.out.println(number);
	}
}
