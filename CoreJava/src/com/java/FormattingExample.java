package com.java;

import java.io.Console;

public class FormattingExample {

	public static void main(String[] args) {
		
		// %d for integer, %f for float and %n for line terminator.
		// %x for hexadecimal, %s for string, 
			double money= 534.33;
			System.out.format("%6.1f", money);
			
			//To interact with console, use System.console(). Returns console if available, else null.
			Console cs=System.console();
			cs.writer().print("hello");
	}

}
