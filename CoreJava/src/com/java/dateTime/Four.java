package com.java.dateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Four {

	public static void main(String[] args) {
		//Period : models out of day, week , year
		LocalDate date1= LocalDate.now();
		LocalDate date2= LocalDate.of(2015,1, 21);
		Period p1= Period.between(date1, date2);
		System.out.println(p1);
		System.out.println(p1.toTotalMonths());
		System.out.println(p1.getMonths());
		Period p2= Period.between(date2, date1);
		System.out.println(p2);
		System.out.println(p2.getYears());
		System.out.println(p2.plusDays(30));
		System.out.println(p2.multipliedBy(2));
		System.out.println(p1.isNegative());
		System.out.println(p1.withMonths(2));
		Period p3= date1.until(date2);
		System.out.println(p3);
		System.out.println(p3.get(ChronoUnit.DAYS));
	}

}
