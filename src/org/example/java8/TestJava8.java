package org.example.java8;

import java.time.LocalDateTime;

public class TestJava8 {

	public static void main(String[] args) throws Exception {
		LocalDateTime time = LocalDateTime.now();
		Thread.sleep(1000);
		System.out.println("time " + (LocaDateTime));
		// An instance of a functional interface using a lambda expression
		TestInterface tester = () -> System.out.println("Java SE 8 is working!");
		tester.test();

	}

}
