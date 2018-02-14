package com.java.dateTime;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Seven {

	public static void main(String[] args) {
		GregorianCalendar cal= GregorianCalendar.from(ZonedDateTime.now());
		cal.set(Calendar.DAY_OF_MONTH, 20);
		//Month started with 0
		cal.set(Calendar.MONTH, 4);
		System.out.println(cal.getTime());
		
		//New api
		ZonedDateTime zd= ZonedDateTime.now();
		//Month starts with 1
		zd.withMonth(4);
		//immutable
		System.out.println(zd.getMonth());
		System.out.println(zd.withDayOfMonth(20));
		System.out.println(zd.with(ChronoField.MILLI_OF_SECOND, 1));
	}

}
