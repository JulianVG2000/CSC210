// Name: Julian van Geest
// Date: 9/18/2021
// Project Description: This project is aimed at prompting a user to
//       input a numerator and denominator value to determine whether
//       their fraction is a proper fraction or an improper fraction. 
//       Improper fractions must be displayed to either a reduced 
//       integer form or a mixed fraction form of a + b / c if b % c
//       is not zero.
// Input: numerator & denominator
// Output: proper fraction, improper fraction, mixed numbers, integers
// Comment: An 'error' output should only occur if the numerator
//          or denominator is negative. Additionally, this program
//          does not use negative or zero inputs for the numerator or
//          denominator values.
//          Definitions of proper fractions, improper fractions, and
//          mixed fractions can be found at:
//          www.ltcconline.net/greenl/courses/187/b/impropermixed.htm

package myCLUHW3;

import java.util.Scanner;

public class Fractions {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Establish numerator input from user
		System.out.print("Enter numerator: ");
		int numerator = input.nextInt();
		
		// Establish denominator input from user
		System.out.print("Enter denominator: ");
		int denominator = input.nextInt();
		
		// Define the remainder for mixed fractions
		int remainder = numerator % denominator;
		
		// Create if statements to distinguish between proper &
		// improper fractions
		if (numerator > 0 && denominator > 0) {
			if (numerator == denominator) {
				System.out.print(
				"Try again, " + 
				"make sure the numerator and denominator " + 
				"are different values");
			}
			else if (numerator < denominator) {
			    System.out.print(numerator + " / " + denominator + 
			    " is a proper fraction");
		    }
		    else if (numerator > denominator && remainder == 0) {
			    System.out.print(numerator + " / " + denominator + 
			    " is an improper fraction which can be reduced to " + 
			    numerator / denominator);
		    }
		    else if (numerator > denominator && remainder > 0) {
			    System.out.print(numerator + " / " + denominator + 
			    " is an improper fraction which can be written as " + 
			    numerator / denominator + " + " + remainder + " / " + 
			    denominator + " in mixed fraction form");
		    }
		}
		else {
			System.out.print(
			"ERROR! Do not use zero or negative values");
		}

	}

}
