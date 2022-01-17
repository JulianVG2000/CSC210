package myCLUch12;

import java.util.Scanner;

public class Exceptions {

	/*
	public static int quotient(int number1, int number2) {
		if (number2 == 0)
			// throw exception
			throw new ArithmeticException("Divisor cannot be zero");
		
		return number1 / number2;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		try {
			int result = quotient(number1, number2);
			System.out.println(number1 + " / " + number2 + " is "
			+ result);
		}
		catch (ArithmeticException ex) {
			System.out.println("Exception: an integer " +
		"cannot be divided by zero");
		}
		
		System.out.println("Execution continues ...");

	}
	*/
	public static void main(String[] args) {
		try {
			int value = 50;
			if (value < 40)
				throw new Exception("value is too small");
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Contine after the catch block");
	}

}
/*
                          // 12.1 //

Exception handling enables a program to deal with exceptional 
situations and continue its normal execution.

                          // 12.2 //

Exception handling: Allows a method can throw an exception to its
caller, allowing the caller to handle the exception. If we didn't
have these exception handlings, the called method would have to 
deal with the exception or terminate the program, and called method 
sometimes doesn't know what to do in case of error (but the caller
does).

Exceptions are created objects from the class:
java.lang.ArithmeticException

Simply type a string message into str in the constructor to describe
the exception (exception message):
ArithmeticException(str)

Throwing an exception passes it from one place to another. The try
block will run its code if it encounters no exceptions. The catch 
block "catches" the thrown exception and handles it if it encounters
one. Statements after the catch block will still be executed. An 
exception can be thrown if you literally use a throw statement, or
you write a method that could throw an exception (like 1 / 0).

                          // 12.3 //

Figure 12.1: Throwable class is the root of all exception classes.

3 major exception types:
1. System Errors: thrown by JVM and represented in Error class, were
error classes describe internal system errors (LinkageError,
VirtualMachineError)
2. Exceptions: represented in Exception class, were exception classes
describe program errors (ClassNotFoundException, IOException).
3. Runtime Exceptions: represented in RuntimeException class, this
class describes programming errors, accessing out-of-bounds array, and
numeric errors (ArithmeticException, NullPointerException,
IndexOutOfBoundsException, IllegalArgumentException).

RuntimeException, Error, and their subclasses are known as unchecked 
exceptions (Java doesn't need you to write a catch or declare 
exceptions). Every other exception is a checked exception (Java needs
you to write a catch block or declare an exception in the method
header).

                          // 12.4 //

Java deals with exceptions in 3 operations:
1. Declaring exceptions: declare an exception in the method
	public void myMethod() throws IOException
Or, for multiple exceptions
	public void myMethod()
	   throws Exception1, Exception2, ..., ExceptionN
Note: "throws" declares an exception while "throw" throws an 
exception.
2. Throwing exceptions: the program creates a exception and throws it
if it finds an error
	throw new IllegalArgumentException("Wrong Argument");
3. Catching exceptions: exceptions are caught in a try-catch block
	try {
	   statements; // Statements that may throw exceptions
	}
	catch (Exception1 exVar1) {
	   handler for exception1;
	}
	catch (ExceptionN exVarN) {
	   handler for exceptionN;
	}
	
The handlers for a exception are found by propagating the exception
back through method calls, beginning from the current method. The
process is repeated until the exception is caught or passed to the
main method. (starts from methodN to method1 (bottom-up),
in each method Java looks for exceptions in the try block first,
then the catch block if it finds one. Note: Each method has its own
try-catch block). If a catch block catches exception objects of a
superclass, it can catch all the exception objects of the subclasses
of the superclass (thus, methodN should start with a superclass,
while method1 is a subclass).

If one of the statements in the try block throws an exception, the
remaining statements in the try block are skipped and looks for a
handler.

You can declare checked exceptions (not error/RuntimeException) in 2
ways:
1.
	void p1() {
	   try {
	      p2();
	   }
	   catch (Exception1 | ... | ExceptionN ex) {
	      ...
	   }
	}
2.
	void p1()
	   throws Exception1, ..., ExceptionN {
	      p2();
	}
Note: Exception1 should be superclass; ExceptionN, subclass.

In the java.lang.Throwable class, you can use printStackTrace(),
getMessage(), toString(), and getStackTrace() methods to obtain
information from exception objects. (Figure 12.4). In the catch block
you might write: System.out.println("/n" + ex.getMessage());

                          // 12.6 //

Use if-else instead of try-catch if the errors are simple and
expected.

                          // 12.7 //

Exception handlers can rethrow an exception if the handler can't 
process the exception or it wants to let its caller know about the
exception:
	try {
	   statements;
	}
	catch (TheException ex) {
	   perform operations before exits;
	   throw ex;
	}

                          // 12.8 //

Throwing an exception while other exceptions are thrown forms a
chained exception.

                          // 12.9 //

You can define a custom class by adding "extends" to a 
java.lang.Exception class object:
	public class InvalidRadiusException extends Exception{
	}

Skipped 12.5, 12.10-12.13
*/