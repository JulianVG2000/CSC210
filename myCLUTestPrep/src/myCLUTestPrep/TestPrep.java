package myCLUTestPrep;

import java.util.Arrays;
import java.util.Scanner;

public class TestPrep {

	///////////////////////////////////////////////////////////
	//////////////////     Chapter 1       ////////////////////
	///////////////////////////////////////////////////////////
	/*
	public static void main(String[] args) {
		double radius = 5.5;
		double area = ((int)(100.0 * Math.PI * Math.pow(radius, 2))) / 100.0;
		double perimeter = ((int)(100.0 * 2 * Math.PI * radius)) / 100.0;
		
		System.out.println(area);
		System.out.println(perimeter);

	}// 1.8
	*/
	/*
	public static void main(String[] args) {
		double kilometers = 14.0;
		double minutes = 45.5;
		final double MILES = kilometers * (1 / 1.6);
		final double HOURS = minutes * (1 / 60.0);
		double speed = ((int)(100.0 * MILES / HOURS)) / 100.0;
		System.out.println(
			"The runner's speed was " + speed + " miles per hour");

	}// 1.10
	*/
	/*
	public static void main(String[] args) {
		double miles = 24.0;
		double hours = 1.0;
		double minutes = 40.0;
		double seconds = 35.0;
		final double KILOMETERS = miles * 1.6;
		final double HOURS_FROM_MIN = minutes * (1 / 60.0);
		final double HOURS_FROM_SEC = seconds * (1 / 3600.0);
		double speed = ((int)(100.0 * miles / (hours + HOURS_FROM_MIN + HOURS_FROM_SEC))) / 100.0;
		System.out.println(
			"The runner's speed was " + speed + " kilometers per hour");

	}// 1.12
	*/
	/*
	public static void main(String[] args) {
		double currentPopulation = 312032486.0;
		double birthEverySec = 1 / 7.0;
		double deathEverySec = 1 / 13.0;
		double immigrantEverySec = 1 / 45.0;
		final double BIRTH_EVERY_YEAR = birthEverySec * 60 * 60 * 24 * 365;
		final double DEATH_EVERY_YEAR = deathEverySec * 60 * 60 * 24 * 365;
		final double IMMIGRANT_EVERY_YEAR = immigrantEverySec * 60 * 60 * 24 * 365;
		double Population = 0.0;
		for (int nextYear = 1; nextYear <= 5; nextYear++) {
			Population = currentPopulation + (BIRTH_EVERY_YEAR * nextYear) - (DEATH_EVERY_YEAR * nextYear) + (IMMIGRANT_EVERY_YEAR * nextYear);
			System.out.println("Current population (after " + nextYear + " year(s)): " + Population);
		}

	}// 1.11
	*/
    ///////////////////////////////////////////////////////////
    //////////////////     Chapter 2       ////////////////////
    ///////////////////////////////////////////////////////////
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		double area = ((int)(100.0 * Math.PI * Math.pow(radius, 2)))/ 100.0;
		double volume = ((int)(100.0 * area * length)) / 100.0;
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);

	}// 2.2
	*/
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal and a graduity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		double gratuity = subtotal * (gratuityRate / 100);
		double total = gratuity + subtotal;
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);

	}// 2.5
	*/
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		int digit1 = number % 10;
		int digit2 = number / 10 % 10;
		int digit3 = number / 100;
		int sum = digit1 + digit2 + digit3;
		System.out.println("The sum of all digits is " + sum);

	}// 2.6
	*/
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double currentPopulation = 312032486.0;
		double birthEverySec = 1 / 7.0;
		double deathEverySec = 1 / 13.0;
		double immigrantEverySec = 1 / 45.0;
		final double BIRTH_EVERY_YEAR = birthEverySec * 60 * 60 * 24 * 365;
		final double DEATH_EVERY_YEAR = deathEverySec * 60 * 60 * 24 * 365;
		final double IMMIGRANT_EVERY_YEAR = immigrantEverySec * 60 * 60 * 24 * 365;
		double Population = 0.0;
		System.out.println("Enter the number of years: ");
		int nextYear = input.nextInt();
		Population = currentPopulation + (BIRTH_EVERY_YEAR * nextYear) - (DEATH_EVERY_YEAR * nextYear) + (IMMIGRANT_EVERY_YEAR * nextYear);
		System.out.println("The population in " + nextYear + " year(s) is " + Population);

	}// 2.11
	*/
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the driving distance: ");
		double drivingDistance = input.nextDouble();
		System.out.println("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		System.out.println("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();
		double costOfDriving = ((int)(100.0 * drivingDistance / milesPerGallon * pricePerGallon)) / 100.0;
		System.out.println("The cost of driving is $" + costOfDriving);

	}// 2.23
	*/
    ///////////////////////////////////////////////////////////
    //////////////////     Chapter 3       ////////////////////
    ///////////////////////////////////////////////////////////
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int integer1 = 1 + (int)(Math.random() * 100);
		int integer2 = 1 + (int)(Math.random() * 100);
		System.out.println("Enter the sum of: " + integer1 + " and " + integer2);
		int userInput = input.nextInt();
		if (userInput == integer1 + integer2) 
			System.out.println("Correct");
		else
			System.out.println("Wrong");

	}// 3.2
	*/
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month = 1 + (int)(Math.random() * 12);
		switch(month) {
			case 1: System.out.println("January");
			break;
			case 2: System.out.println("Feburary");
			break;
			case 3: System.out.println("March");
			break;
			case 4: System.out.println("April");
			break;
			case 5: System.out.println("May");
			break;
			case 6: System.out.println("June");
			break;
			case 7: System.out.println("July");
			break;
			case 8: System.out.println("August");
			break;
			case 9: System.out.println("September");
			break;
			case 10: System.out.println("October");
			break;
			case 11: System.out.println("November");
			break;
			case 12: System.out.println("December");
			break;
			default: System.out.println("Error");
			System.exit(1);
		}

	}// 3.4
	*/
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter today's day: ");
		int today = input.nextInt();
		System.out.println("Enter the number of days elapsed since today: ");
		int elapsedDays = input.nextInt();
		switch (today) {
		case 0: System.out.print("Today is Sunday ");
		break;
		case 1: System.out.print("Today is Monday ");
		break;
		case 2: System.out.print("Today is Tuesday ");
		break;
		case 3: System.out.print("Today is Wednesday ");
		break;
		case 4: System.out.print("Today is Thursday ");
		break;
		case 5: System.out.print("Today is Friday ");
		break;
		case 6: System.out.print("Today is Saturday ");
		break;
		default: System.out.print("Enter correct date");
		System.exit(1);
		}
		switch (today + elapsedDays) {
		case 0,7,14: System.out.print("and the future day is Sunday");
		break;
		case 1,8,15: System.out.print("and the future day is Monday ");
		break;
		case 2,9,16: System.out.print("and the future day is Tuesday ");
		break;
		case 3,10,17: System.out.print("and the future day is Wednesday ");
		break;
		case 4,11,18: System.out.print("and the future day is Thursday ");
		break;
		case 5,12,19: System.out.print("and the future day is Friday ");
		break;
		case 6,13,20: System.out.print("and the future day is Saturday ");
		break;
		default: System.out.print("Enter correct date");
		System.exit(1);
		}

	}// 3.5
	*/
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three-digit integer: ");
		int userInteger = input.nextInt();
		if (userInteger / 100 == userInteger % 10) {
			System.out.println(userInteger + " is a palindrome");
		}else
			System.out.println(userInteger + " is not a palindrome");

	}// 3.12
	*/
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("scissor(0), rock(1), paper(2): ");
		int userInteger = input.nextInt();
		int computerInteger = 0 + (int)(Math.random() * 3);
		if (userInteger > 2) {
			System.out.print("Pick correct number");
			System.exit(1);
		}
		switch (computerInteger) {
		case 0: System.out.print("The computer is scissor. ");
		break;
		case 1: System.out.print("The computer is rock. ");
		break;
		case 2: System.out.print("The computer is paper. ");
		break;
		}
		switch (userInteger) {
		case 0: System.out.print("You are scissor");
		break;
		case 1: System.out.print("You are rock");
		break;
		case 2: System.out.print("You are paper");
		break;
		}
		if (computerInteger == userInteger) 
			System.out.print(" too. It is a draw");
		else
			System.out.print(". ");
		if (userInteger == 0 && computerInteger == 1)
			System.out.print("You lose");
		else if (userInteger == 1 && computerInteger == 0)
			System.out.print("You win");
		else if (userInteger == 0 && computerInteger == 2)
			System.out.print("You win");
		else if (userInteger == 2 && computerInteger == 0)
			System.out.print("You lose");
		else if (userInteger == 1 && computerInteger == 2)
			System.out.print("You lose");
		else if (userInteger == 2 && computerInteger == 1)
			System.out.print("You win");

	}// 3.17
	*/
    ///////////////////////////////////////////////////////////
    //////////////////     Chapter 4       ////////////////////
    ///////////////////////////////////////////////////////////
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter grade: ");
		String userInteger = input.nextLine();
		if (userInteger.contains("A"))
			System.out.println("The numeric value for grade " + userInteger + " is 4");
		else if (userInteger.contains("B"))
			System.out.println("The numeric value for grade " + userInteger + " is 3");
		else if (userInteger.contains("C"))
			System.out.println("The numeric value for grade " + userInteger + " is 2");
		else if (userInteger.contains("D"))
			System.out.println("The numeric value for grade " + userInteger + " is 1");
		else if (userInteger.contains("F"))
			System.out.println("The numeric value for grade " + userInteger + " is 0");
		else
			System.out.println(userInteger + " is an invalid grade");

	}// 4.14
	*/
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char letter = (char)(65 + (int)(Math.random() * 26));
		System.out.println(letter);

	}// 4.16
	*/
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		System.out.println("Enter a month: ");
		String month = input.next();
		if (month.contains("Jan")) 
			System.out.println(month + " " + year + " has 31 days");
		else if (month.contains("Feb") && (year % 4 == 0))
			System.out.println(month + " " + year + " has 29 days");
		else if (month.contains("Feb") && (year % 4 != 0))
			System.out.println(month + " " + year + " has 28 days");
		else if (month.contains("Mar"))
			System.out.println(month + " " + year + " has 31 days");
		else if (month.contains("Apr"))
			System.out.println(month + " " + year + " has 30 days");
		else if (month.contains("May"))
			System.out.println(month + " " + year + " has 31 days");
		else if (month.contains("Jun"))
			System.out.println(month + " " + year + " has 30 days");
		else if (month.contains("Jul"))
			System.out.println(month + " " + year + " has 31 days");
		else if (month.contains("Aug"))
			System.out.println(month + " " + year + " has 31 days");
		else if (month.contains("Sep"))
			System.out.println(month + " " + year + " has 30 days");
		else if (month.contains("Oct"))
			System.out.println(month + " " + year + " has 31 days");
		else if (month.contains("Nov"))
			System.out.println(month + " " + year + " has 30 days");
		else if (month.contains("Dec"))
			System.out.println(month + " " + year + " has 31 days");
		else {
			System.out.println("Input correct terms");
			System.exit(1);
		}

	}// 4.17
	*/
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two characters: ");
		String characters = input.next();
		if (characters.contains("M"))
			System.out.print("Mathematics ");
		else if (characters.contains("C"))
			System.out.print("Computer Science ");
		else if (characters.contains("I"))
			System.out.print("Information Technology ");
		else {
			System.out.print("Invalid Input");
			System.exit(1);
		}
		if (characters.contains("1"))
			System.out.print("Freshman");
		else if (characters.contains("2"))
			System.out.print("Sophomore");
		else if (characters.contains("3"))
			System.out.print("Junior");
		else if (characters.contains("4"))
			System.out.print("Senior");
		else {
			System.out.print("Invalid Input");
			System.exit(1);
		}

	}// 4.18
	*/
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char letter1 = (char)(65 + (int)(Math.random() * 26));
		char letter2 = (char)(65 + (int)(Math.random() * 26));
		char letter3 = (char)(65 + (int)(Math.random() * 26));
		int digit1 = 0 + (int)(Math.random() * 10);
		int digit2 = 0 + (int)(Math.random() * 10);
		int digit3 = 0 + (int)(Math.random() * 10);
		int digit4 = 0 + (int)(Math.random() * 10);
		System.out.println(Character.toString(letter1) + Character.toString(letter2) + Character.toString(letter3) + digit1 + digit2 + digit3 + digit4);

	}// 4.25
	*/
    ///////////////////////////////////////////////////////////
    //////////////////     Chapter 5       ////////////////////
    ///////////////////////////////////////////////////////////
	/*
	public static void main(String[] args) {
		int miles1;
		double kilometers1;
		int kilometers2 = 20;
		double miles2;
		System.out.printf("%-12s%-12s%-3s%-17s%-12s\n", "Miles", "Kilometers", "|", "Kilometers", "Miles");
		for (miles1 = 1; miles1 <= 10; miles1++) {
			kilometers1 = miles1 * 1.609;
			miles2 = 1000.0 * kilometers2 / 1.609;
			System.out.printf("%-12d%-12f%-3s%-17d%-12f\n", miles1, kilometers1, "|", kilometers2, miles2);
			kilometers2 += 5;
		}

	}// 5.6
	*/
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int numberOfStudents = input.nextInt();
		System.out.println("Enter student names and respective score (Enter to close): ");
		String studentName1 = input.next();
		String studentScore1 = input.next();
		String highestScoreStudent = "";
		for (int count = 2; count <= numberOfStudents; count++) {
			String studentName2 = input.next();
			String studentScore2 = input.next();
			if (Integer.parseInt(studentScore2) > Integer.parseInt(studentScore1)) {
				highestScoreStudent = studentName2;
			}else if (Integer.parseInt(studentScore2) < Integer.parseInt(studentScore1)) {
				highestScoreStudent = studentName1;
			}
			if (studentName2.contains("") || studentScore2.contains(""))
				break;
		}
		System.out.println("Highest scoring student is " + highestScoreStudent);

	}// 5.8
	*/
	/*
	public static void main(String[] args) {
		double sum = 0.0;
		int i = 0;
		for (i = 1; i <= 97; i++) {
			sum += i / (i + 2.0);
			i += 1;
		}
		System.out.println(sum);

	}// 5.24
	*/
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int inputNumber1 = input.nextInt();
		int max = inputNumber1;
		int count = 0;
		int inputNumber2 = 0;
		do {
			inputNumber2 = input.nextInt();
			if (max < inputNumber2) {
				max = inputNumber2;
				count = 0;
			}
			if (max == inputNumber2) {
				count++;
			}
		}while (inputNumber2 != 0);
		System.out.println("The largest number is " + max);
		System.out.println("The occurrence count of the largest number is " + count);

	}// 5.41
	*/
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String userString = input.next();
		String reversedString = "";
		int i = userString.length() - 1;
		while (i >= 0) {
			reversedString += userString.charAt(i);
			i--;
		}
		System.out.println("The reversed string is " + reversedString);

	}// 5.46
	*/
    ///////////////////////////////////////////////////////////
    //////////////////     Chapter 6       ////////////////////
    ///////////////////////////////////////////////////////////
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int userInteger = input.nextInt();
		System.out.println("The sum of all digits is " + sumDigits(userInteger));

	}
	public static int sumDigits(long n) {
		int userInteger = 0;
		int digit1 = (int) (n % 10);
		int partialdigit = 1;
		while(partialdigit != 0) {
			partialdigit = (int) (n / 10);
			userInteger += (int) (partialdigit % 10);
			partialdigit = (int) (partialdigit / 10);
		}
		int digit3 = (int) (n / 100);
		int answer = userInteger + digit1 + digit3;
		return answer;
	}// 6.2
	*/
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("%-15s%-17s%-8s%-15s%-15s\n", "Celcius", "Fahrenheit", "|", "Fahrenheit", "Celcius");
		double celsius = 0;
		double fahrenheit = 120;
		for (celsius = 40.0; celsius >= 31.0; celsius--) {
			System.out.printf("%-15f%-17f%-8s%-15f%-15f\n", celsius, celsiusToFahrenheit(celsius), "|", fahrenheit, fahrenheitToCelsius(fahrenheit));
			fahrenheit -= 10.0;
		}

	}
	public static double celsiusToFahrenheit(double celsius) {
		double fahrenheit = (9.0 / 5) * celsius + 32;
		return fahrenheit;
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		return celsius;
	}// 6.8
	*/
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter valid password: ");
		String password = input.next();
		if (checkPassword(password) == true) 
			System.out.println("Valid Password");
		else if (checkPassword(password) == false)
			System.out.println("Invalid Password");

	}
	public static boolean checkPassword(String password) {
		boolean answer = false;
		int d = 0;
		if (password.length() >= 8) {
			for (int a = 65, b = 97, c = 48; a <= 90 && b <= 122 && c <= 57; a++, b++, c++) {
				if (password.contains((char) a + "") || password.contains((char) b + "") || password.contains((char) c + "")) {
					d = password.indexOf((char) c + "");
					if (password.indexOf((char) c + "", d + 1) != -1) {
						answer = true;
					}
				}
			}
		}
		return answer;
	}// 6.18
	*/
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String userString = input.next();
		System.out.println("Enter a character: ");
		char userCharacter = input.next().charAt(0);
		System.out.println("The character " + userCharacter + " occurs " + count(userString, userCharacter) + " times in the string " + userString);

	}
	public static int count(String str, char a) {
		int count = 0;
		if (str.indexOf(a) != -1)
			count++;
		int length = str.indexOf(a, str.indexOf(a) + 1);
		while (count != -1) {
			if (length != -1) {
				count++;
				length = str.indexOf(a, length + 1);
			}else
				break;
		}
		return count;
	}// 6.23
	*/
    ///////////////////////////////////////////////////////////
    //////////////////     Chapter 7       ////////////////////
    ///////////////////////////////////////////////////////////
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		System.out.println("Enter " + numberOfStudents + " scores: ");
		int[] scores = new int[numberOfStudents];
		for (int i = 0; i < numberOfStudents; i++) {
			scores[i] = input.nextInt();
		}
		for (int a = 0; a < numberOfStudents; a++) {
			System.out.print("Student " + a + " score is " + scores[a] + " and grade is ");
			assignGrade(scores);
			System.out.println("");
		}

	}
	public static void assignGrade(int[] scores) {
		java.util.Arrays.sort(scores);
		int best = scores[scores.length - 1];
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= best - 10) {
				System.out.print("A");
				break;
			}
			if (scores[i] >= best - 20) {
				System.out.print("B");
				break;
			}
			if (scores[i] >= best - 30) {
				System.out.print("C");
				break;
			}
			if (scores[i] >= best - 40) {
				System.out.print("D");
				break;
			}
			else {
				System.out.print("F");
				break;
			}
		}
	}// 7.1
	*/
	/*
	public static void main(String[] args) {
		int randomIntegers = 0;
		int[] counts = new int[10];
		for (int i = 0; i < 100; i++) {
			randomIntegers = 0 + (int)(Math.random() * 10);
			for (int a = 0; a < 10; a++) {
				if (randomIntegers == a)
					counts[a] += 1;
			}
		}
		System.out.println(Arrays.toString(counts));

	}// 7.7
	*/
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		double[] numbers = new double[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		System.out.println("The minimum number is: " + min(numbers));

	}// 7.9
	public static double min(double[] array) {
		java.util.Arrays.sort(array);
		double min = array[0];
		return min;
	}// 7.9
	*/
    ///////////////////////////////////////////////////////////
    //////////////////     Chapter 8       ////////////////////
    ///////////////////////////////////////////////////////////
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		double[][] m = new double[3][4];
		for (int row = 0; row < m.length; row++) {
			for (int column = 0; column < m[row].length; column++) {
				m[row][column] = input.nextDouble();
			}
		}
		for (int i = 0; i < m[0].length; i++) {
			System.out.println("Sum of the elements at column " + i + " is " + sumColumn(m,i));
		}

	}
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		int column = columnIndex;
		for (int row = 0; row < m.length; row++) {
			sum += m[row][column];
		}
		return sum;
	}// 8.1
	*/
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		double[][] matrix = new double[4][4];
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextDouble();
			}
		}
		System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));

	}
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0.0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][i];
		}
		return sum;
	}// 8.2
	*/

}
