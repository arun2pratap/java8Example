<<<<<<< 0a4f6fd2000c98d8bbe0765cd05c4b7016f9c665
package org.example.java8.defaultfunc;

public class DefaultMethod {

	public static void main(String[] args) {
		SAMwithDefault op1 = p -> System.out.println("First"+p);
		SAMwithDefault op2 = p -> System.out.println("Second"+p);
		SAMwithDefault op3 = op1.printTwice(op2);
		op3.print(" Default method with lamda returned");
	}

}
=======
package org.example.java8.defaultfunc;

public class DefaultMethod {

	public static void main(String[] args) {
		SAMwithDefault op1 = p -> System.out.println("First"+p);
		SAMwithDefault op2 = p -> System.out.println("Second"+p);
		SAMwithDefault op3 = op1.printTwice(op2);
		op3.print(" Default method with lamda returned");
	}

}
>>>>>>> default functions
