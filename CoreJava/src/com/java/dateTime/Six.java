package com.java.dateTime;

import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Six {

	public static void main(String[] args) {
		GregorianCalendar cal= GregorianCalendar.from(ZonedDateTime.now());
		System.out.println(cal);
		System.out.println(cal.get(Calendar.MILLISECOND));
		cal.add(Calendar.HOUR, 5);
		System.out.println(cal);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal.getCalendarType());
		System.out.println(cal.getTime());
		System.out.println(cal.getTimeZone());
		System.out.println(Calendar.getInstance(Locale.US).getTimeZone());
		
	}

}
