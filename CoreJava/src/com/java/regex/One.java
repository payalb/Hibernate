package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class One {

	public static void main(String[] args) {
		int count = 0;
		Pattern p = Pattern.compile("ab");
		Matcher matcher = p.matcher("ababbaba");
		while (matcher.find()) {
			count++;
			// matcher end() method returns end index + 1
			System.out.println(matcher.start() + " End index is  "
					+ matcher.end() + " .String is " + matcher.group());
			//group returns matched string
		}
		System.out.println("String is present " + count + " times.");
		// 1) Pattern is compiled version of regular expression.
		// Equivalent java object of regular expression
		// 2) Matcher : to match the given pattern in the target string.
	}

}
