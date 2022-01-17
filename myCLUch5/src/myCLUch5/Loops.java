package myCLUch5;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// Counter-controlled loop (the loop's control variable 
		// "count" is inside the loop body)
		/*
		int count = 0;
		while (count < 100) {
			System.out.println(
				"This will output 100 times in increments of 1");
			count++;
		*/
		/*
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 1; j++)
				System.out.println(i * j);
		*/
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		int low = 0;
		int high = s.length() - 1;
		boolean isPalindrome = true;
		while (low < high) {
			if (s.charAt(low) != s.charAt(high)) {
				isPalindrome = false;
				break;
			}
			low++;
			high--;
		}
		if (isPalindrome)
			System.out.println(s + " is a palindrome");
		else
			System.out.println(s + " is not a palindrome");
			
		
		}

	}

/*
                             // 5.1 //

Loops allow a user to output statements repeatedly.

                             // 5.2 //

While loops will output a statement repeatedly while the 
loop-continuation-condition (a boolean statement) is true. Otherwise,
the loop ends and the program proceeds to output any statements past
the while loop.

Loop-continuation-condition should eventually become false, or else
the loop will run forever. (Press CTRL+C to stop)

Sentinel-controlled loops use a sentinel value (special input value 
that signifies the end of the input) as the
loop-continuation-condition.

Input redirection: program takes input from a file (input.txt) rather
than having a user type inputs from the keyboard. Run the program 
using:
java SentinelValue < input.txt
Output redirection: program sends output to a file (output.txt) rather
than having it on the console. The command to do this is:
java ClassName > output.txt
To get input from input.txt and output it to output.txt, use:
java SentinelValue output.txt
Note: the data stored in input.txt should be separated by whitespaces

                             // 5.3 //

A do-while loop executes the whatever is in the loop body once, and
then checks the loop-continuation-condition repeatedly again for
whatever statement is in the loop body.

                             // 5.4 //

for loops follow:
for (initial-action; loop-continuation-condition; 
	action-after-each-iteration) {
	// Loop body
	Statement(s);
}
A for loop cannot use a variable outside the for loop if the variable
is declared within the for loop:
for (int a = 1, b = 2; a - b < 101; a++, b++)
	System.out.println("Hello");

                             // 5.6 //

For nested loops, which have inner loop(s) within an outer loop,
each time the outer loop is repeated, the inner loops are reentered, 
and started anew.

                             // 5.7 //

Using float numbers as the loop-continuation-condition will result in
close approximate outcomes. To minimize this error, make variables 
in the double data type, make the 3 terms of a for loop as int data
type, and make the statements in the for loop increase with each 
iteration.

                             // 5.9 //

If you have break or continue in an if statement within a while loop,
break will terminate both the if statement and the while loop, while 
continue would terminate just the if statement and ends the current
iteration of the while loop so that the rest of the while loop's body
is not executed.

*/