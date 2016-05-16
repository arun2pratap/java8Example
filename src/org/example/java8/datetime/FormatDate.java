package org.example.java8.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class FormatDate {
	public static void main(String args[]){
		LocalDate currDate = LocalDate.now();
		DateTimeFormatter dtFormatter = DateTimeFormatter.ISO_DATE;
		DateTimeFormatter dtFormatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		
		System.out.println(dtFormatter.format(currDate));
		System.out.println(dtFormatter2.format(currDate));
		

		String fr_fr =  dtFormatter2.withLocale(Locale.FRENCH).format(currDate);
		String fr_fr2 =  dtFormatter2.withLocale(Locale.GERMAN).format(currDate);
		
		System.out.println(fr_fr);
		System.out.println(fr_fr2);
		

		
		DateTimeFormatterBuilder dtBuilder = new DateTimeFormatterBuilder()
				.appendValue(ChronoField.MONTH_OF_YEAR)
				.appendLiteral("||")
				.appendValue(ChronoField.YEAR)
				.appendLiteral("||")
				.appendValue(ChronoField.DAY_OF_MONTH);
		DateTimeFormatter customFormatter = dtBuilder.toFormatter();
		System.out.println(customFormatter.format(currDate));
		
		
	}
}
