// Name: Julian van Geest
// Date: 10/2/2021
// Project Description: This program asks the user to pick a
//    difficulty setting for a basic arithmetic learning game. These
//    difficulty settings range from Simple, Medium, and Hard. The user
//    is also asked to choose which arithmetic operation they wish to
//    use: +, -, /, *, %. Simple difficulty generates two random 
//    integer numbers between -10 to +10; Medium, two random double 
//    numbers between -1000.00 to +1000.00; Hard, two random double 
//    numbers between -10000.00 to +10000.00. Based on the difficulty 
//    and arithmetic operator the user chose, they will be asked to 
//    solve the arithmetic operation. The program will output, if they
//    are correct, 1 point for the user. If the user is wrong, they 
//    receive 0 points. The program will also ask the user if they 
//    wish to continue the program or exit.
// Input: Simple, Medium, Hard, +, -, /, *, %, user answer, 
//        continue/exit
// Output: Correct/incorrect, points earned, continue/exit
// Comment: The answer to the arithmetic problem will only be
//          output to the user if they got the solution wrong.

package myCLUHW5;

import java.util.Scanner;

public class Learning {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String userResponse = "";
		int error = 1;
		do {
			do {
				try {
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
						randomNum1 = Math.round(100.00 * (-1000.00 + Math.random() * 2001.00)) / 100.00;
						randomNum2 = Math.round(100.00 * (-1000.00 + Math.random() * 2001.00)) / 100.00;
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
					switch (userArithmeticOp) {
					case "+":
						solution = Math.round(100.00 * (randomNum1 + randomNum2)) / 100.00;
						break;
					case "-":
						solution = Math.round(100.00 * (randomNum1 - randomNum2)) / 100.00;
						break;
					case "/":
						solution = Math.round(100.00 * (randomNum1 / randomNum2)) / 100.00;
						break;
					case "*":
						solution = Math.round(100.00 * (randomNum1 * randomNum2)) / 100.00;
						break;
					case "%":
						solution = Math.round(100.00 * (randomNum1 % randomNum2)) / 100.00;
						break;
					default: 
						System.out.println(
							"Error: input correct operator statement");
						System.exit(1);
					}
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
					error = 2;
				}catch (Exception ex) {
					System.out.println("Computer processed an error!");
				}
			}while(error == 1);
		}while (userResponse.equalsIgnoreCase("Yes"));

	}

}
