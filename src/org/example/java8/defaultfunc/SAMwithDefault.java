<<<<<<< 0a4f6fd2000c98d8bbe0765cd05c4b7016f9c665
package org.example.java8.defaultfunc;

@FunctionalInterface
public interface SAMwithDefault {

	void print(String p);
	
	default SAMwithDefault printTwice(SAMwithDefault op2){
		return (p -> {print(p); op2.print(p);});
	}
}
=======
package org.example.java8.defaultfunc;

@FunctionalInterface
public interface SAMwithDefault {

	void print(String p);
	
	default SAMwithDefault printTwice(SAMwithDefault op2){
		return (p -> {print(p); op2.print(p);});
	}
}
>>>>>>> default functions
