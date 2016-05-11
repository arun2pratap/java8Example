package org.example.java8.methodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.example.java8.dto.Person;

public class MethodReference {

		public static void main(String args[]){
			MethodReference methodReference = new MethodReference();
			List<Person> persons = new ArrayList<>();
			persons.add(new Person(45,"Arun"));
			persons.add(new Person(85,"Arun"));
			persons.add(new Person(35,"Arun"));
			persons.add(new Person(75,"Arun"));
			persons.add(new Person(49,"Arun"));

//			nameList.forEach(p -> System.out.println("age : "+ p.getAge()));
			Collections.sort(persons, Person :: compareAges);
			persons.forEach(p -> System.out.println("age : "+ p.getAge()));
			
			System.out.println("\n--------");
			methodReference.sortData();
			
		}

		private void sortData() {
			List<Person> persons2 = new ArrayList<>();
			persons2.add(new Person(45,"Arun"));
			persons2.add(new Person(85,"Arun"));
			persons2.add(new Person(35,"Arun"));
			persons2.add(new Person(75,"Arun"));
			persons2.add(new Person(49,"Arun"));
			

			Collections.sort(persons2, this :: compareAges);
			persons2.forEach(p -> System.out.println("age : "+ p.getAge()));
		}
		
		public int compareAges(Person p1, Person p2){
			Integer age1 = p1.getAge();
			return age1.compareTo(p2.getAge());
		}
}
