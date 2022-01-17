// Name: Julian van Geest
// Date: 9/10/2021

                           // Analysis //
// The goal of this project is to create a unit conversion table
// from European units to US units in a single, compact table. The
// table should contain all European units as user inputed values on
// the left-hand side of the table, and the respective US converted 
// units on the right-hand side of the table.

// Input: celcius, centimeter, meter, square meter, liter,
// gram, kilogram
// Output: fahrenheit, inch, foot, square foot, US gallon,
// ounce, pound

package myCLUHW2;

import java.util.Scanner;

public class Converters {

	public static void main(String[] args) {
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Title each column
		System.out.println("European Units" + "               " +
		"US Units");
		
		               // Celsius Converter //
		
		// Ask for celsius values
		System.out.print("Celsius = ");
		double celsius = input.nextDouble();
		
		// Conversion equation
		double fahrenheit = celsius * 9.0 / 5 + 32;
		
		// Output
		System.out.println("                             " + 
		"Fahrenheit " + (int)(fahrenheit * 1000) / 1000.0);
		
		             // Centimeter Converter //
		
		// Ask for centimeter value
		System.out.print("Centimeter = ");
		double centimeter = input.nextDouble();
		
		// Conversion equation
		double inch = centimeter * 0.3937;
		
		// Output
		System.out.println("                             " + 
		"Inch " + (int)(inch * 1000) / 1000.0);
		
		              // Meter Converter //
		
		// Ask for meter value
		System.out.print("Meter = ");
		double meter = input.nextDouble();
		
		// Conversion equation
		double foot = meter * 3.28084;
		
		// Output
		System.out.println("                             " + 
		"Foot " + (int)(foot * 1000) / 1000.0);
		
		           // Square Meter Converter //
		
		// Ask for square meter value
		System.out.print("Square Meter = ");
		double square_meter = input.nextDouble();
		
		// Conversion equation
		double square_foot = square_meter * Math.pow(3.28084, 2);
		
		// Output
		System.out.println("                             " + 
		"Square Foot " + (int)(square_foot * 1000) / 1000.0);
		
		               // Liter Converter //
		
		// Ask for liter value
		System.out.print("Liter = ");
		double liter = input.nextDouble();
		
		// Conversion equation
		double us_gallon = liter / 3.785411784;
		
		// Output
		System.out.println("                             " + 
		"US Gallon " + (int)(us_gallon * 1000) / 1000.0);
		
		               // Gram Converter //
		
		// Ask for gram value
		System.out.print("Gram = ");
		double gram = input.nextDouble();
		
		// Conversion equation
		double ounce = gram * 0.035274;
		
		// Output
		System.out.println("                             " + 
		"Ounce " + (int)(ounce * 1000) / 1000.0);
		
		              // Kilogram Converter //
		
		// Ask for kilogram value
		System.out.print("Kilogram = ");
		double kilogram = input.nextDouble();
		
		// Conversion equation
		double pound = kilogram * 2.2046;
		
		// Output
		System.out.println("                             " + 
		"Pound " + (int)(pound * 1000) / 1000.0);

	}

}
