package org.example.java8.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.function.Predicate;

public class TimeZone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT+0"));
		System.out.println(gmt);

		ZonedDateTime gmt2 = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(gmt2);
		
		Set<String> zones = ZoneId.getAvailableZoneIds();
		
		Predicate<String> condition = str -> str.contains("London");
		
		zones.stream().filter(condition).forEach(z -> System.out.println(z));
		
	}

}
