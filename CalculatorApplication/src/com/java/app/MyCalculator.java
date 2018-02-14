package com.java.app;

public class MyCalculator {
	
	public static void main(String[] args) {
		int x = 3, y = 4;
        switch(x + 3){
                case 6: y = 0;
                case 7: y = 1;
                default: y += 1;
        }
        
        System.out.println(x+" "+ y);

	}
	
	public String add(String string1, String string2){
		string1= "hi";
		return string1+ string2;
	}
}
