package org.example.java8.defaultfunc;

@FunctionalInterface
public interface SAMwithDefault {

	void print(String p);
	
	default SAMwithDefault printTwice(SAMwithDefault op2){
		return (p -> {print(p); op2.print(p);});
	}
}
