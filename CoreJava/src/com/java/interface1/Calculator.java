package com.java.interface1;

public class Calculator  implements CalculatorInt, CalculatorInt2{
	
	public int add( int num1, int num2){
		return num1+num2;
	}
	
	public int sub( int num1, int num2){
		return num1-num2;
	}

	public int mul( int num1, int num2){
		return num1*num2;
	}
	public int div( int num1, int num2){
		return num1/num2;
	}

	@Override
	public void fact(int num1) {
		
	}
	 public void mod(int a, int b){
		
	}
	 /*static public void  printNumbers(int number){
		 CalculatorInt.printNumbers(2);
		}*/

	 public static void main(String args[]){
		 CalculatorInt.printNumbers(2);
	//	 CalculatorInt2.printNumbers(3);
	//	 Calculator.printNumbers(4);
		 //static methods are not overridden
	 }
}
