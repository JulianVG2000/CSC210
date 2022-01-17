// Name: Julian van Geest
// Date: 9/28/2021
// Project Description: This program's goal is to ask the user to
//    enter a word for a city, food, person name, country, and animal
//    using a randomly generated letter from A-Z. The user will 
//    receive a score for each word based on the following criteria:
//       a) If the first letter of the word matches the generated
//          letter (10 points).
//       b) If one of the middle letters of the word matches the
//          generated letter (5 points).
//       c) If the last letter of the word matches the generated
//          letter (2 points).
// Input: city, food, person, name, country, animal
// Output: total score
// Comment: randomly generated word will be capitalized, but if the
//    middle or last letters of the user inputed word contains the
//    respective lower-case letter, the point will still count.

package myCLUHW4;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		char letter = (char)(65 + Math.random() * 26);
		String sLetter = Character.toString(letter);
		
		System.out.println(
			"Enter a city, food, person name, country, and animal "
			+ "that has the randomly generated letter. ");
		System.out.println("Highest score is 50 points: 10 points " +
			"if the first letter matches, 5 points if the middle "); 
		System.out.println("letters match, and 2 points if the " + 
			"last letter matches.");
		
		// Get city, food, person name, country, and animal from user
		System.out.println(
			"Enter a city that has the letter " + letter + ": ");
		String city = input.nextLine();
		System.out.println(
			"Enter a food that has the letter " + letter + ": ");
		String food = input.nextLine();
		System.out.println(
			"Enter a name that has the letter " + letter + ": ");
		String name = input.nextLine();
		System.out.println(
			"Enter a country that has the letter " + letter + ": ");
		String country = input.nextLine();
		System.out.println(
			"Enter an animal that has the letter " + letter + ": ");
		String animal = input.nextLine();
		
		int cityScore = 0;
		int foodScore = 0;
		int nameScore = 0;
		int countryScore = 0;
		int animalScore = 0;
		
		if (city.toUpperCase().trim().startsWith(sLetter)) {
			// Check if user input starts with letter
			cityScore = 10;
		}else if (city.toUpperCase().trim().endsWith(sLetter)) {
			// Check if user input ends with letter
			cityScore = 2;
		}else if (city.toUpperCase().trim().contains(sLetter)) {
			// Check if user input contains letter
			cityScore = 5;
		}else {
			// End user input
			System.exit(1);
		}
		
		if (food.toUpperCase().trim().startsWith(sLetter)) {
			// Check if user input starts with letter
			foodScore = 10;
		}else if (food.toUpperCase().trim().endsWith(sLetter)) {
			// Check if user input ends with letter
			foodScore = 2;
		}else if (food.toUpperCase().trim().contains(sLetter)) {
			// Check if user input contains letter
			foodScore = 5;
		}else {
			// End user input
			System.exit(1);
		}
		
		if (name.toUpperCase().trim().startsWith(sLetter)) {
			// Check if user input starts with letter
			nameScore = 10;
		}else if (name.toUpperCase().trim().endsWith(sLetter)) {
			// Check if user input ends with letter
			nameScore = 2;
		}else if (name.toUpperCase().trim().contains(sLetter)) {
			// Check if user input contains letter
			nameScore = 5;
		}else {
			// End user input
			System.exit(1);
		}
		
		if (country.toUpperCase().trim().startsWith(sLetter)) {
			// Check if user input starts with letter
			countryScore = 10;
		}else if (country.toUpperCase().trim().endsWith(sLetter)) {
			// Check if user input ends with letter
			countryScore = 2;
		}else if (country.toUpperCase().trim().contains(sLetter)) {
			// Check if user input contains letter
			countryScore = 5;
		}else {
			// End user input
			System.exit(1);
		}
		
		if (animal.toUpperCase().trim().startsWith(sLetter)) {
			// Check if user input starts with letter
			animalScore = 10;
		}else if (animal.toUpperCase().trim().endsWith(sLetter)) {
			// Check if user input ends with letter
			animalScore = 2;
		}else if (animal.toUpperCase().trim().contains(sLetter)) {
			// Check if user input contains letter
			animalScore = 5;
		}else {
			// End user input
			System.exit(1);
		}
		
		// Process data
		int totalScore = cityScore + foodScore + nameScore + 
			countryScore + animalScore;
		
		// Output results
		System.out.println("Your total score is: " + totalScore);

	}

}
