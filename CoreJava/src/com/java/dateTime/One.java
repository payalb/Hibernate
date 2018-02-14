package com.java.dateTime;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class One {

	public static void main(String[] args) {
		// 1) Calling date time api with null as argument => Null pointer
		// exception
		// 2) Do not return null value
		LocalDate today = LocalDate.now();
		System.out.println(today.with(TemporalAdjusters.lastDayOfMonth())
				.minusDays(2));
		// 3) Most of the api create objects that are immutable.
		LocalDate date1 = LocalDate.of(2017, 9, 16);
		System.out.println(date1);
		date1.plusDays(4);
		System.out.println(date1);
	}

}
