// Name: Julian van Geest
// Date: 10/9/21
// Project Description: This program will repeatedly ask the user to
// enter a domain name and will display whether the domain name is
// valid and has a core gTLD. The domain name will be valid if it
// contains a second-level domain followed by a TLD. The second-level
// domain has 3 attributes:
//    1. 1-63 characters in length
//    2. Has only uppercase and lowercase letters, or a dash
//    3. Doesn't begin or end with a dash
// The domain name should only have one period. To end the program,
// the Enter key must be pressed to exit.
// Input: domain name
// Output: valid/invalid domain name, TLD, core gTLD
// Comment: TLD (top-level domain) name is the last part of an
// Internet domain name such a .net. Core generic top-level domain
// (core gTLD) is a TLD that is .com, .net, .org, or .info. Restricted
// top-level domain is a TLD that is .biz, .name, or .pro. Second-
// level domain is a single name that precedes a TLD.

package myCLUHW6;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {
		
		int count = 1;
		String userInput = "";
		
		while (count == 1) {
			
			Scanner input = new Scanner(System.in);
			
			// Get domain name from user
			System.out.println("Enter domain name (Press Enter to exit): ");
			userInput = input.nextLine();
			
			// Output results
			if (hasValidDomain(userInput).contains("a valid domain name ")) {
				System.out.println("\"" + userInput + "\"" + " is " + hasValidDomain(userInput) + hasValidSecondLevel(userInput) + 
						getThePositionofPeriod(userInput) + isspecificTLD(userInput));
			}else if (hasValidDomain(userInput).contains("not a valid domain name.")) {
				System.out.println("\"" + userInput + "\"" + " is " + hasValidDomain(userInput));
			}
			
			// Response to exit from user
			if (userInput.equals("")) {
				count = 2;
			}
				
		}

	}
	
	public static String getThePositionofPeriod(String answer) {
		String result = "";
		if (answer.contains(".")) {
			result = "and has a valid period position, ";
			int check = answer.indexOf(".") + 1;
			if (answer.indexOf(".", check) > -1) {
				result = "";
			}
		}
		return result;
	} // Check if user has valid period position
	
	public static String isspecificTLD(String answer) {
		String result = "";
		if (answer.contains(".com") || answer.contains(".net") || answer.contains(".org") || answer.contains(".info")) {
			// Check if user has core gTLD
			return result = "and has a core gTLD of " + answer.substring(answer.indexOf(".")) + ".";
		}else if (answer.contains(".biz") || answer.contains(".name") || answer.contains(".pro")) {
			// Check if user has TLD
			return result = "and has a TLD of " + answer.substring(answer.indexOf(".")) + ".";
		}
		return result;
	}
	
	public static String hasValidSecondLevel(String answer) {
		String result = "";
		if (answer.length() < 64 && !(answer.startsWith("-") || answer.endsWith("-"))) {
			for (int i = 0; i < answer.indexOf("."); i++) {
				if (Character.isLowerCase(answer.charAt(i)) || Character.isUpperCase(answer.charAt(i))) {
					result = "with a valid second-level domain ";
				}
			}
		}
		return result;
	} // Check if user has valid second-level
	
	public static String hasValidDomain(String answer) {
		String result = "";
		if (answer.contains(".")) {
			result = "a valid domain name ";
			int check = answer.indexOf(".") + 1;
			if (answer.indexOf(".", check) > -1) {
				result = "not a valid domain name.";
			}
		}
		return result;
	} // Check if user has valid Domain

}
