package com.java.dateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Five {

	public static void main(String[] args) {
		LocalDate date= LocalDate.now();
		System.out.println(date);
		DateTimeFormatter formatter1= DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(date.format(formatter1));
		DateTimeFormatter formatter2= DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(date.format(formatter2));
		DateTimeFormatter formatter3= DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(date.format(formatter3));
		DateTimeFormatter formatter4= DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(date.format(formatter4));
		DateTimeFormatter formatter5= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String text= "29/11/2019";
		
		System.out.println(LocalDate.parse(text, formatter5));
		
	}

}
