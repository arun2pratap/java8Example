package org.example.java8.streams;

import java.util.stream.Stream;

import org.example.java8.dto.Person;

public class ArrayStream {

	public static void main(String[] args) {
		Person[] people = {new Person(56, "Anshul"), new Person(75, "Gaurav"),
					new Person(65, "Gaurav Verma"), new Person(29, "Abhijeet"), new Person(45, "Arun")}; 
		Stream<Person> streamOfArray = Stream.of(people);
		streamOfArray.filter((p) -> p.getAge() > 35).forEach( p -> System.out.println(p));	
	}
}
