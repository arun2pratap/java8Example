package org.example.java8.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMap {
	public static void main(String args[]){
		List<String> list = Arrays.asList("1","2","3","4","2");
		Stream<Float> map = list.stream().map(s -> Float.parseFloat(s));
		List<Float> numbers = list.stream().map(s -> Float.parseFloat(s)).collect(Collectors.toList());
		List<Float> distinctNumbers = list.stream().map(s -> Float.parseFloat(s)).distinct().collect(Collectors.toList());
		System.out.println("numbers :"+ numbers);
		System.out.println("distinctNumbers :"+ distinctNumbers);
	}
}
