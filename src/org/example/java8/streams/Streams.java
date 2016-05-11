package org.example.java8.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import org.example.java8.dto.Person;

public class Streams {
	public static void main(String args[]){
		Predicate<Person> predOlder = (p) -> p.getAge() > 45;
		Predicate<Person> predYounger = (p) -> p.getAge() <= 45; 
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(45,"Arun"));
		persons.add(new Person(85,"Arun"));
		persons.add(new Person(35,"Arun"));
		persons.add(new Person(75,"Arun"));
		persons.add(new Person(49,"Arun"));

//		nameList.forEach(p -> System.out.println("age : "+ p.getAge()));
//		Collections.sort(persons, Person :: compareAges);
		persons.stream().filter(predOlder).forEach(p -> System.out.println("age : "+ p.getAge()));
		System.out.println("\n\n -----------");
		persons.stream().filter(predYounger).forEach(p -> System.out.println("age : "+ p.getAge()));
		

	}
}
