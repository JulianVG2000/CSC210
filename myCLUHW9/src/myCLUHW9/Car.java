// Name: Julian van Geest
// Date: 11/14/2021
// Project Description: Make a test main() class that tests a car class to set and get
// the purchase price of a car via the methods: setPurchasePrice() & getPurchasePrice().
// And, the information of the car must be output with a 2011 model year, a purchase
// price of 18000, and a current value of 5770 if the inputed values of the car was a
// 2011 model with a 18000 dollar purchase price in the year 2018.
// Input: model year, purchase price, current year
// Output: model year, purchase price, current value
// Comment:

package myCLUHW9;

import java.util.Scanner;

class TestCar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Car car = new Car();
		car.setPurchasePrice();
		car.getPurchasePrice();
		car.setModelYear(2011);
		car.getModelYear();
		car.calcCurrentValue(2018);
		car.printInfo();

	}
}

public class Car {
	
	private int modelYear;
	private int currentValue;
	
	Car() {
		modelYear = 0;
		currentValue = 0;
	}
	public void setModelYear(int userYear) {
		modelYear = userYear;
	}
	public int getModelYear() {
		return modelYear;
	}
	public double setPurchasePrice() {
		return 18000;
	}
	public double getPurchasePrice() {
		return setPurchasePrice();
	}
	public void calcCurrentValue(int currentYear) {
		currentValue = (int)(getPurchasePrice() - 1747.14 * (currentYear - modelYear));
	}
	public void printInfo() {
		System.out.println("Car's information:");
		System.out.println("   Model year: " + getModelYear());
		System.out.println("   Purchase price: " + getPurchasePrice());
		System.out.println("   Current value: " + currentValue);
	}

}
