package org.example.java8.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String args[]){
		List<String> nameList = new ArrayList<>();
		nameList.add("Arun");
		nameList.add("Sandeep");
		nameList.add("Harry");
		nameList.add("Tamal Sen");
		nameList.add("Devendra");
		
		Predicate<String> predLonger = (p) -> p.length() >= 4;
		nameList.forEach( p -> {
			if(predLonger.test(p)){System.out.println(" Long names : " + p);}});
		}
	}
