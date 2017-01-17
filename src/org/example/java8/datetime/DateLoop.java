package org.example.java8.datetime;

import java.time.*;
import java.util.*;

public class DateLoop {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDate startDate = LocalDate.now();
		System.out.println("locafs df sj"+ startDate);
		LocalDate endDate = LocalDate.now().plusDays(11);
		System.out.println("localEndDatej df sj"+ endDate);

		LocalDate localstartDate = startDate;
        for (LocalDate localEndDate1 = startDate.plusDays(10); localstartDate.isBefore(endDate.plusDays(1)); localEndDate1 = localEndDate1.plusDays(10)) {
        	if(endDate.isBefore(localEndDate1)){
        		localEndDate1 = endDate;
        	}
        	System.out.println("loca"+ localstartDate + ", " + localEndDate1);
        	localstartDate = localEndDate1.plusDays(1);
        }
            
        	

	}

}
