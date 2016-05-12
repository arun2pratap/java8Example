package org.example.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateEx {
	public static void main(String args[]){
		LocalDate lc = LocalDate.now();
		System.out.println(lc);
		
		LocalDate lcSpecific = LocalDate.of(2016, 05, 01);
		System.out.println("\n"+ lcSpecific);
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		LocalTime lctSpecific = LocalTime.of(12, 32,34);
		System.out.println(lctSpecific);
		LocalDateTime lcdt = LocalDateTime.now();
		System.out.println(lcdt);
		LocalDateTime lcdtSpecific = LocalDateTime.of(lc, localTime);
		System.out.println(lcdtSpecific);
	}
}
