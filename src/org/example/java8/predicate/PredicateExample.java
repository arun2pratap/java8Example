package org.example.java8.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.w3c.dom.NameList;

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
		nameList.stream().filter(predLonger).forEach(p -> System.out.println(p));
		
	}
		
}
