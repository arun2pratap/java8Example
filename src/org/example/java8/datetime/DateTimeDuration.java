package org.example.java8.datetime;

import java.time.Duration;
import java.time.Instant;

public class DateTimeDuration {

	public static void main(String[] args) throws InterruptedException {
		Instant inst = Instant.now();
		Thread.sleep(1000);
		Instant inst2 = Instant.now();
		System.out.println("start: " + inst);
		System.out.println("end: "+ inst2);
		
		Duration duration = Duration.between(inst, inst2);
		System.out.println("Elapsed: " + duration.toMillis());
	}

}
