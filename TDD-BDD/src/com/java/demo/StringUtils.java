package com.java.demo;

public class StringUtils {

	public static String swapLastTwoChar(String str) {
		if (str == null)
			return null;
		if (str.length() <= 1)
			return str;
		char lastChar = str.charAt(str.length() - 1);
		char secondLastChar = str.charAt(str.length() - 2);
		str = str.substring(0, str.length() - 2) + lastChar + secondLastChar;
		System.out.println(str);
		return str;
	}

}
