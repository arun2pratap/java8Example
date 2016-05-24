package org.example.java8.higherOrderFunction;

import java.util.function.Predicate;
import java.util.stream.Stream;

import org.example.java8.dto.Person;

public class HigherOrderFunctionPredicate {
	public static void main(String args[]){

		Person[] people = {new Person(56, "Anshul"), new Person(75, "Gaurav"),
					new Person(65, "Gaurav Verma"), new Person(29, "Abhijeet"), new Person(45, "Arun")}; 
		Stream<Person> persons = Stream.of(people);
		Predicate<Person> older = e -> e.getAge() > 45;
		Predicate<Person> younger = e -> e.getAge() < 70;
		Predicate<Person> combinedPredicate = older.and(younger);
		persons.filter(combinedPredicate).forEach(e -> System.out.println(e));
	}
}
