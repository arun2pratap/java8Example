package org.example.java8.dto;

public class Person {

	Integer age;
	String name;
	String address;
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
	
	@Override
	public String toString() {		
		return "Name: "+ name	+ "  Age: " + age;
	}
	
	public static int compareAges(Person p1, Person p2){
		Integer age1 = p1.getAge();
		return age1.compareTo(p2.getAge());
	}
}
