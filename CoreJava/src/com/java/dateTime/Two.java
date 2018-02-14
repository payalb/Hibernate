package com.java.dateTime;

import java.time.LocalDate;

public class Two {

	public static void main(String[] args) {
//Java.time package: immutable classes: LocalDate
		LocalDate date1= LocalDate.now();
		LocalDate date2=LocalDate.of(2017, 6, 28);
		System.out.println(date1.getYear());
		System.out.println(date2.getDayOfYear());
		System.out.println(date1.plusDays(4));
		System.out.println(date2.minusMonths(4));
		System.out.println(date1.isBefore(date2));
		System.out.println(date1.withDayOfYear(360));
		System.out.println(date1);
		System.out.println(date1.isLeapYear());
		System.out.println(date1.withMonth(4));
	}

}
