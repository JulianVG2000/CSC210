package myCLUch6;

public class Methods {

	public static void main(String[] args) {
		// Listing 6.1
		// Listing 6.2
		System.out.println((char)(65 + (int)(Math.random() * 26)));

	}

}
/*
                             // 6.1 //

A method is the same as a function, it is a statement that does an
operation.

                             // 6.2 //

A method consists of its method name, parameters, return value type,
and body
modifier returnValueType methodName(list of parameters) {
   // Method body;
}
Value-returning method: returnValueType is the data type of the value
the method returns (the method must use a return statement to return
a result).
Void method: returnValueType is void and does't return anything.

                             // 6.3 //

When a program calls a method, program control is transferred to the
called method. A called method returns control to the caller when its
return statement is executed or when its method-ending closing brace
is reached.
An activation record stores parameters and variables for the method.
The method places the activation record in an area of memory known as
the "stack." When a method calls another method, the caller's 
activation record is kept intact, and a new activation record is 
created for the new method called. When a method finishes its work
and returns to its caller, its activation record is removed from the
call stack.

                             // 6.4 //

A return statement is not needed for void methods.
methodName is invoked as a value from a value-returning method, while
methodName is invoked as a statement from a void method.

                             // 6.5 //

Arguments are passed by order, number, and compatible type to 
parameters when invoking a method.
Pass-by-value: By invoking a method with an argument, the value of the
argument is passed to the parameter.

                             // 6.8 //

Overloading methods allows a user to define methods with the same 
methodName as long as their signatures are different.
max(1,1) will use the int method
max(1.0,1.0) will use the double method
max(1,1.0) will use the double method (1 is converted to a double)

                             // 6.9 //

Scope of a variable is where the variable can be referenced in a 
program. A variable declared inside a method or a loop body is a local
variable (ex, parameter).
*/