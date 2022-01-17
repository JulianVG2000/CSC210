package myCLUch4;

import java.util.Scanner;
public class QFT {

	public static void main(String[] args) {
		/*
		int i = 1;
		int j = 2;
		System.out.println("i + j is " + (i + j));
		*/
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character: ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		System.out.println("The character entered is " + ch);
		*/
		/*
		String s1 = "Welcome to Java";
		String s2 = "Programming is fun";
		String s3 = "Welcome to Java";
		System.out.println(1 + "Welcome " + 'a' + 1);
		*/
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees",
		"Radians", "Sine", "Cosine", "Tangent");
		int degrees = 30;
		double radians = Math.toRadians(degrees);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", 
			degrees, radians, Math.sin(radians), Math.cos(radians),
			Math.tan(radians));
		degrees = 60;
		radians = Math.toRadians(degrees);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", 
				degrees, radians, Math.sin(radians),
				Math.cos(radians), Math.tan(radians));

	}

}
/*
                             // 4.2 //

A method is a group of statements that perform a specific task.

a + Math.random() * b returns a random number between
a and (a + b) - 1

All classes in the java.lang package are implicitly imported in a Java
program.

                             // 4.3 //
                              
You can use increment and decrement operators on a char.

An escape sequence has 2 escape characters: the first has to start
with a backslash \ and the second could be t, for example for tab. 
\t tabs, while \u03b1 is Unicode for a character on the ASCII table.
System.out.println("He said \"Java is fun\"");
System.out.println("\\t is a tab character");

A char can be cast as a number, or vice-versa. When an integer is cast
into a char, only the lower 16 bits of data are used, while the others
are ignored:
char ch = (char)OXAB0041; // lower hex code 0041 will output A

When a float value is casted into char, it is first cast into int,
and then cast into char:
char ch = (char)65.25; // ch is 65, which is A

When a char is cast to a number,
int i = (int)'A'; // i is 65

Every numeric operator can be applied to char operands. These operands
are already cast into numbers if the other operand is a number or a 
character. if the other operand is a string, the character is 
concatenated with the string.
int i = '2' + '3' // i is 101
System.out.print("Chapter " + '2'); // outputs Chapter 2

Characters can be compared by relational operators
'a' < 'b' is true b/c a is 97 and b is 98

Table 4.6: isDigit(), isLetter(), etc

                             // 4.4 //

A string is a sequence of characters:
String something = "Hello";

Instance methods are invoked using an object (like a String). Static
methods are invoked without using an object (like the methods in the
Math class).

Table 4.7: methods for String objects - length(), charAt(index), 
concat(s1), toUpperCase(), toLowerCase(), trim()

System.out.println("Length of " + something + " is " 
+ something.length());
length() counts all characters, including white spaces.

s.charAt(index) method retrieves a specific character in a string s,
where the index is between 0 and s.length()-1

String s3 = s1.concat(s2); is the same as String s3 = s1 + s2;
With + signs, at least one operand must be a string in order to 
attach the other operands to it in one complete string. If there are 
no strings, the + sign will simply be the addition operator.
String s = "Chapter" + 2; // Chapter2
String s1 = "Supplement" + 'B'; // SupplementB
+= can be used for concatination:
s += " starts on pg 35"; // Chapter2 starts on pg 35

System.out.println("i + j is " + i + j); // i + j is 12
System.out.println("i + j is " + (i + j)); // i + j is 3

toLowerCase() outputs your string in all lowercase; toUpperCase(), 
uppercase. ' ', \t, \f, \r, and \n are whitespace characters. trim()
erases whitespace characters from both ends of the string.

next() method reads a string that ends with a whitespace character.
nextLine() reads an entire line of text.
If input.nextLine() is replaced by input.next(), you cannot enter a
string with spaces.

Table 4.8: methods to compare strings
equals(s1), equalsIgnoreCase(s1), compareTo(s1), 
compareToIgnoreCase(s1), startsWith(prefix), endsWith(suffix),
contains(s1)

if s1 is abc and s2 is abg, s1.compareTo(s2) outputs -4 because: the
first two characters (a vs. a) are compared, then (b vs. b), then
(c vs. g). Since c is 4 less than g lexicographically (in terms of 
Unicode ordering).

"Welcome to Java".startsWith("We") returns true
"Welcome to Java".startsWith("we") returns false

String message = "Welcome to Java";
String message = message.substring(0, 11) + "HTML";
// outputs Welcome to HTML

Table 4.10: methods for finding substrings
index(), indexOf(), lastIndex(), lastIndexOf()

To convert from string into an int value:
int intValue = Integer.parseInt(intString);
where intString is "123".
To convert from string into a double value:
double doubleValue = Double.parseDouble(doubleString);
where doubleString is "123.45".
To convert from number to string:
String s = number + "";

                             // 4.6 //

System.out.printf(format, item1, item2, ..., itemk) method allows us
to display formatted output on the console. Format is a string that
may consist of substrings and format specifiers. 
Table 4.11: Format specifiers specify how an item should be displayed
%b, %c, %d, $f, %e, %s
they consist of a percent followed by a conversion code
An item can be a number, character, boolean, or a string. They must
match the format specifiers in order, in number, and in type.
	int count = 5;
	double amount = 45.56;
	System.out.printf("count is %d and amount is %f", count, amount);
	// count is 5 and amount is 45.560000

Table 4.12: Specifying width and precision
%5c, %6b, %5d, %10.2f, %10.2e, %12s

If an item requires more spaces than the specified width, the width
is automatically increased:
	System.out.printf("%3d#%2s#%4.2f\n", 1234, "Java", 51.6653);
	// displays 1234#Java#51.67
1234 is width 4, 51.67 is width 5

By default, the output is right justified. Putting a (-) in the 
format specifier will specify that the item is left justified in the
output. This means that extra spaces will be placed after the 
numbers, not before them like how they normally are.
*/