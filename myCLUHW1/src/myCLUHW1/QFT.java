// Name: Julian van Geest
// Date: 9/5/2021

/*
Analysis:
This program should be able to input custom investment amounts, annual interest rates, and number of years,
and output the future investment value using a future investment formula.
*/

// Input: investment amounts, annual interest rates, and number of years
// Output: future investment formula

package myCLUHW1;

public class QFT {

	public static void main(String[] args) {
		
		// Input
		double b = 1000.0; // investment amount (b)
		double x = 4.25; // annual interest rate (x)
		double t = 1; // number of years (t)
		
		// Monthly interest rate (X)
		double X = (x / 12) / 100;
		
		// Calculate total (T) using future investment formula
		double T = b * Math.pow(1 + X, t * 12);
		
		// Output
		System.out.println("Future investment value");
		System.out.println("$" + T);

	}

}
