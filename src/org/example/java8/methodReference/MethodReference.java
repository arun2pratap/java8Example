package org.example.java8.methodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.example.java8.dto.Person;

public class MethodReference {

		public static void main(String args[]){
			List<Person> nameList = new ArrayList<>();
			nameList.add(new Person(45,"Arun"));
			nameList.add(new Person(85,"Arun"));
			nameList.add(new Person(35,"Arun"));
			nameList.add(new Person(75,"Arun"));
			nameList.add(new Person(49,"Arun"));
			
			Collections.sort(nameList, Person :: compareAges)
		}
}
