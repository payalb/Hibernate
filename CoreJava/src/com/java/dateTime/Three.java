package com.java.dateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalField;

public class Three {

	public static void main(String[] args) {
		ZonedDateTime date= ZonedDateTime.now();
		System.out.println(date);
		System.out.println(date.withZoneSameLocal(ZoneId.of("Europe/Paris")));
		
		ZonedDateTime date1= ZonedDateTime.of(2017, 9, 27, 14, 52, 30, 45, ZoneId.systemDefault());
		System.out.println(date1);
		System.out.println(date1.getDayOfMonth());
		System.out.println(date1.getHour());
		System.out.println(date1.isAfter(date));
		System.out.println(date1.plusDays(5));
		System.out.println(date1);
		System.out.println(date1.minusWeeks(4));
		System.out.println(date1.getChronology());
		System.out.println(date1.toEpochSecond());
		System.out.println(date1.getOffset());
		System.out.println(date1.getZone());
		System.out.println(date1.withDayOfYear(267));
		
		
	}

}
