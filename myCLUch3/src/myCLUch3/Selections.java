package myCLUch3;

import java.util.Scanner;

public class Selections {

	public static void main(String[] args) {
		/*
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is " + number1 + " + " + number2 +
		"? ");
		
		int number = input.nextInt();
		
		System.out.println(
		number1 + " + " + number2 + " = " + number + " is " +
		(number1 + number2 == number));
		*/
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		if (number % 5 == 0)
			System.out.println("HiFive");
		*/
		/*
		Scanner input = new Scanner (System.in);
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		double bmi = weightInKilograms / 
				(heightInMeters * heightInMeters);
		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	    */
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		// Get difficulty and arithmetic operator from user
		System.out.println(
			"Select difficulty (Simple, Medium, or Hard): ");
		String userDifficulty = input.next();
		System.out.println(
			"Select arithmetic operation (+, -, /, *, %): ");
		String userArithmeticOp = input.next();
		
		// Process Data
		double randomNum1 = 0;
		double randomNum2 = 0;
		switch (userDifficulty) {
		case "Simple":
			randomNum1 = (int)(-10 + (int)(Math.random() * 21));
			randomNum2 = (int)(-10 + (int)(Math.random() * 21));
			break;
		case "Medium":
			randomNum1 = 1;
			randomNum2 = 0;
			//randomNum1 = Math.round(100.00 * (-1000.00 + Math.random() * 2001.00)) / 100.00;
			//randomNum2 = Math.round(100.00 * (-1000.00 + Math.random() * 2001.00)) / 100.00;
			break;
		case "Hard":
			randomNum1 = Math.round(100.00 * (-10000.00 + Math.random() * 20001.00)) / 100.00;
			randomNum2 = Math.round(100.00 * (-10000.00 + Math.random() * 20001.00)) / 100.00;
			break;
		default:
			System.out.println(
				"Error: input correct difficulty statement");
			System.exit(1);
		}
		double solution = 0;
		do {
			try {
				switch (userArithmeticOp) {
				case "+":
					solution = Math.round(100.00 * (randomNum1 + randomNum2)) / 100.00;
					error = 2;
					break;
				case "-":
					solution = Math.round(100.00 * (randomNum1 - randomNum2)) / 100.00;
					error = 2;
					break;
				case "/":
					solution = Math.round(100.00 * (randomNum1 / randomNum2)) / 100.00;
					error = 2;
					break;
				case "*":
					solution = Math.round(100.00 * (randomNum1 * randomNum2)) / 100.00;
					error = 2;
					break;
				case "%":
					solution = Math.round(100.00 * (randomNum1 % randomNum2)) / 100.00;
					error = 2;
					break;
				default: 
					System.out.println(
						"Error: input correct operator statement");
					System.exit(1);
				}
			} catch (Exception ex) {
				System.out.println("Computer processed an error!");
			}
		}while(error == 1);
		
		// Get arithmetic answer from user
		System.out.println("Write solution to (" + randomNum1
			+ " " + userArithmeticOp + " " + randomNum2 + ") while " +
			"rounding to the nearest two decimal points: ");
		double userAnswer = input.nextDouble();
		
		// Check if user is correct
		if (userAnswer == solution) {
			// Output results
			System.out.println(
			"Correct! You earned 1 point. Continue? (Yes / No) ");
		}else if (userAnswer != solution) {
			// Output results
			System.out.println(
				"Wrong! Solution is " + solution + "! " +
				"You earned 0 points. Continue? (Yes / No) ");
		} else {
			System.out.println("Error, input correct values");
			System.exit(1);
		}
		// Get continue/exit answer from user
		userResponse = input.next();
	}while (userResponse.equalsIgnoreCase("Yes"));

}

}
*/
		
		
		
		
		
		
		
		
		
		
	}

}
/*
                          // 3.1 //

Selection Statements (if & else) use Booleans expressions, which are
expressions that evaluate a boolean value: true or false.

                          // 3.2 //

The Boolean data type declares a variable with the value either true
or false. Variables obtain a Boolean value from relational operators
(< <= > >= == !=). 

                          // 3.3 //

Selection Statements: one-way if statements, two-way if-else
statements, nested if statements, multi-way if-else statements,
switch statements, and conditional expressions.
 - one-way if statement executes statement if the boolean-expression
 evaluates to true.
   if (radius >= 0) {
   area = radius * radius * PI;
   }
   OR
   if (radius >= 0) 
   area = radius * radius * PI;
   The { } could be removed if the statement is only one line long
   
                          // 3.4 //

An if-else statement executes statements for the true case if the 
Boolean-expression evaluates to true; otherwise, the statements for
the false case are executed.

                          // 3.5 //

An if statement can be inside another if statement to form a nested
if statement. A multi-way if-else statement could be:
   if (score >= 90.0)
   System.out.print("A");
   else if (score >= 80.0)
   System.out.print("B");
   else
   System.out.print("F");

                          // 3.7 //

You can use Math.random() to obtain a random double value between 0.0
and 1.0, excluding 1.0.

                          // 3.10 //
The logical operators not (!), and (&&), or (||), and exclusive or
(^) can be used to create compound Boolean expressions. NOT negates
true to false and false to true. AND is true if and only if two
Boolean operands are true. OR is true if at least one operand is
true. EXCLUSIVE OR is true if and only if the two operands have 
different Boolean values.
p1 ^ p2 is the same as p1 != p2
! (number % 2 == 0 && number % 3 == 0) is the same as 
(number % 2 != 0 || number % 3 != 0)
! (number == 2 || number == 3) is the same as
number != 2 && number != 3

                          // 3.13 //

A switch statement executes statements based on the value of a 
variable or an expression. They generally replace nested if 
statements.
switch (switch-expression) {
   case value1: statement(s)1;
                break;
   default: System.exit(1);
the switch-expression must be a value of char,byte,short,int,String.
value1 should have the same data type as the value of the switch-
expression. A case is ran when the value of the case statement 
matches the value of the switch-expression.

                          // 3.14 //

A conditional expression evaluates an expression based on a condition
we can replace
if (x > 0)
  y = 1;
else
  y = -1;
to
y = (x > 0) ? 1 : -1;
boolean-expression ? expression1 : expression2;

                          // 3.15 //

Operator precedence and associativity determine the order in which
operators are evaluated. Table 3.8 lists the operators of decreasing
precedence when making a calculation. If operators of the same 
precedence are next to each other, their associativity determines
the order of evaluation. 
All binary operators except assignment operators are left associative
(meaning they are calculated from left to right):
a - b + c - d is equivalent to ((a - b) + c) - d
Assignment operators are right associative (calculated from right to
left):
a = b += c = 5 is equivalent to a = (b += (c = 5))

                          // 3.16 //

bugs are logic errors
*/


