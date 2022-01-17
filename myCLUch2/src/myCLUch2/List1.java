// Chapter 2 Notes

package myCLUch2;

import java.util.Scanner;

public class List1 {
/*
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		// Compute Area
		double area = radius * radius * 3.14159;
		
		// Display results
		System.out.println("The area for the circle of radius " + 
		radius + " is " + area);

	}
	*/
	/*
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter three numbers
		System.out.print("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		// Compute Average
		double average = (number1 + number2 + number3) / 3;
		
		// Display results
		System.out.println("The average of " + 
		number1 + " " + number2 + " " + number3 + " is " + average);

	}
*/
	// x = x + 1 is a legal variable in java
	// if you have:
	/* x = 1;
	 * x = x + 1;
	 */
	// This will actually output 2 as your answer to the variable x
	
	// int and double are data types
	// int y = 1; has y as the variable, and int as the data type
	
	// This is legal in java:
	/* System.out.println(x = y = z = 1);
	 * which is the same as doing
	 * x = 1;
	 * y = x;
	 * z = y;
	 * Sytem.out.println(x + " " + y + " " + z);
	 */
	
	// final double PI = 3.14159; declares PI as a constant by using 
	// final
	
	// for constants, the variable should be in all caps
	// for class names, capitalize the first letter of each word: ComputeArea
	// for general variables, leave them all lowercase and descriptive:
	// so don't do a = 1; for area
	// do area = 10;
	
	// Table 2.1 shows all the numeric data types
	
	// just like double number1 = input.nextDouble(); you can also
	// do int number 1 = input.nextInt(); or any other 
	// numeric data type
	
	// 5 / 2 gives 2. In order for 5 / 2 to give 2.5, you need to 
	// make one of the numbers a floating-point number (has a decimal)
	// so: 5.0 / 2 gives 2.5
	
	// the remainder operator has 7 % 3 give 1. 1 is the remainder
	// after you see how many times 3 goes into 7. 3 goes into 7 two
	// times, that's 6, so 7-6 is 1, the remainder of the long-division
	
	// literals are numbers that are like: 4D, 5.0f.
	// They make a number, say 4, a double value because of the D at
	// the end of the number
	
	// both float and double represent numbers with a decimal point
	// floating-point numbers are called this because the numbers are
	// stored in terms of scientific notation. For example, 50.534 is
	// stored as 5.0534E+1 as its decimal has moved (floated) to a 
	// new position
	
	// literals can have underscores between 2 digits: 2_4
	
	// Augmented Assignment operators can be written as i += 8 
	// which is the same as writing i = i + 8
	
	public static void main(String[] args) {
		/*
		double a = 6.5;
		a += a + 1;
		System.out.println(a);
		a = 6;
		a /= 2;
		System.out.println(a);
		*/
		/*
		int i = 1;
		int k = ++i + i;
		System.out.println(k);
		*/
		/*
		float f = 12.5F;
		int i = (int)f;
		System.out.println("f is " + f);
		System.out.println("i is " + i);
		*/
		char ch = (char)99;
		System.out.println(ch);

	}
	
	// if i = 1
	// the preincrement int j = ++i; raises i by 1 unit, and creates
	// a new j value of 2 as i is now 2
	// the postincrement int j = i++; raises i by 1 unit, but uses
	// the original value of j, which is 1, while still having i 
	// equal to 2.
	// the same applies to predecrement int j = --i; or 
	// postdecrement int j = i--; but now i is lowered by 1 unit
	
	// casting is when you convert a value of one data type into 
	// another data type. If you go from double to float, you 
	// narrowed the type. If you go from int to double, you widened
	// the type.
	// System.out.println((double)1 / 2); will output 0.5
	// because 1 goes to 1.0
	// System.out.println((int)1.7); gives 1
	
	// Software Development Process: Requirement specification (input),
	// system analysis (process), system design (output),
	// implementation (coding), testing (check for errors), 
	// deployment (make software available), and maintenance (updates)
	
	// Scanner input = new Scanner(System.in); only needs to be 
	// declared once within a class
}
