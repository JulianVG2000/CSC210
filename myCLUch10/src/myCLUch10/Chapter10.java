package myCLUch10;

public class Chapter10 {

	public static void main(String[] args) {
		// Listing 10.5 & 10.6
		String s1 = "Welcome to Java";
		String s2 = s1.replace("o", "abc");
		System.out.println(s1);
		System.out.println(s2);
	}

}
/*
                             // 10.2 //

Class abstraction is the separation of class implementation from the use of a class. The 
details of implementation are encapsulated and hidden from the user. This is known as class
encapsulation. For example, you can create a Circle object and find the area of the circle 
without knowing how the area is computed. For this reason, a class is also known as an 
abstract data type (ADT). A class's contract are the signatures of public methods and public
constants. Clients use the class through the contract of the class.
For a computer, each of its components can be treated as a class. Whenever you create an 
object to reference a class, you can get it to work together with other objects, but the user
doesn't really know how the internals (methods) of said computer component actually work.

                             // 10.3 //

The procedural paradigm focuses on designing methods. The object-oriented paradigm couples 
data and methods together into objects. Software design using the object-oriented paradigm 
focuses on objects and operations on objects.

                             // 10.4 //

To design classes, you need to explore the relationships among classes: association,
aggregation, composition, and inheritance.
Association: general binary relationship that describes an activity between two classes.
   A student taking a course is an association between the Student class and the Course class,
   and a faculty member teaching a course is an association between the Faculty class and the
   Course class.
   Note: UML on page 373
   The relation "a student takes a course" is implemented using the addCourse method in the 
   Student class and the addStudent method in the Course class. The relation "a faculty 
   teaches a course" is implemented using the addCourse method in the Faculty class and the
   set-Faculty method in the Course class.
Aggregation: special form of association that represents an ownership relationship 
   between two objects. Aggregation models has-a relationships. The owner object is called an
   aggregating object, and its class is called an aggregating class. The subject object is 
   called an aggregated object, and its class is called an aggregated class. 
   An aggregating relationship is usually represented as a data field in the aggregating class
   "a student has a name" and "a student has an address" are implemented as data field "name" 
   and "address" in the Student class.
   Aggregation can occur between objects of the same class. "a person is a supervisor" is 
   implemented as a data field "supervisor" in the Person class.
Composition: An object can be owned by several other aggregating objects. If an object is 
   exclusively owned by an aggregating object, the relationship between the object and its
   aggregating object is referred to as a composition. For example, "a student has a name" is 
   a composition relationship between the student class and the Name class, whereas "a student
   has an address" is an aggregation relationship between the Student class and the Address
   class, since an address can be shared by several students.

                             // 10.7 //

A primitive data type value is not an object, but it can be wrapped in an object using a 
wrapper class in the Java API. By using a wrapper class, you can process primitive data type
value as objects. java.lang package provides Boolean, Character, Double, Float, Byte, Short,
Integer, and Long wrapper classes (e.g., Integer class wraps a Integer value).
Numeric wrapper classes (Integer & Double) have methods which can "convert" objects into 
primitive type values: doubleValue(), floatValue(), intValue(), longValue(), shortValue(), 
and byteValue()
   new Double(12.4).intValue(); // returns 12
   new Integer(12).doubleValue(); // returns 12.0
You can construct a wrapper object either from a primitive data type value (new Double(5.0)) 
or from a string representing the numeric value (new Double("5.0")).
Wrapper class have no-arg constructors and are immutable.
Numeric wrapper classes can use compareTo method (1, 0, -1 if this number is greater than, 
equal to, or less than the other number):
   new Double(12.4).compareTo(new Double(12.3)); // returns 1
The numeric wrapper classes have a useful static method, valueOf(String s), which creates a 
new object initialized to the value represented by the specific string:
   Double doubleObject = Double.valueOf("12.4");
   Integer integerObject = Integer.valueOf("12");
You can convert a decimal number into a hex number using format method:
   String.format("%x", 26); // returns 1A

                             // 10.8 //

Converting a primitive value to a wrapper object is called boxing. The reverse condition is 
called unboxing. The compiler will automatically box a primitive value that appears in a
context requiring an object, and will unbox an object that appears in a context requiring a
primitive value. This is called autoboxing and autounboxing. For example,
   Integer intObject = new Integer(2);
   is the same as
   Integer intObject = 2;

                             // 10.9 //

The BigInteger and BigDecimal classes can be used to represent integers or decimal numbers of
any size and precision. They are in the java.math package, and are both immutable. Use 
new BigInteger(String) and new BigDecimal(String) to create an instance of BigInteger and
BigDecimal:
   BigInteger a = new BigInteger("5");
   BigInteger b = new BigInteger("2");
Use add, subtract, multiply, divide, and remainder or compareTo to perform operations:
   BigInteger c = a.multiply(b);
Use divide(BigDecimal d, int scale, int roundingMode), where scale is the maximum number of 
digits after the decimal point, to avoid arithmetic exceptions:
   BigDecimal c = a.divide(b, 20, BigDecimal.ROUND_UP);

                             // 10.10 //

A String object is immutable.
To create a string object:
   String message = new String("Welcome to Java");
   is the same as
   String message = "Welcome to Java"; 
   since strings are treated as objects.
   OR, you can use an array of characters
Since string objects are immutable, the following:
   String s = "Java";
   s = "HTML";
will first reference "Java" to the variable s, then, "HTML" is referenced to a new variable s.
The variable s now only points to the new object, and the original s cannot be accessed.
String objects can refer to the same interned string, meaning that they both have the same
character sequence:
   String s1 = "Java";
   String s2 = new String("Java");
   String s3 = "Java";
s1 == s2 is false and s1 == s3 is true.
java.lang.String allows us to replace and split strings. // note that the original string is
unchanged
A regular expression (or, regex) is a string that describes a pattern for matching a set of 
strings. The matches method is like the equals method, but more powerful:
   "Java is fun".matches("Java.*"); // is true
   "Java is fun".equals("Java"); // is false
Here, Java.* is the regex.
"440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}"); // is true
Here, \\d is a single digit, and \\d{3} represents 3 digits.
To convert from string to char array:
   char[] chars = "Java".toCharArray();
Use getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) method to copy a substring 
of the string from index srcBegin to index srcEnd - 1 into a character array dst starting 
fromt the index dstBegin.
To convert from an array of chars to a string, use String(char[]) or valueOf(char[]) method.
valueOf allows you to convert all primitive data types into a string.
The format method to return a formated string works exactly like printf, except this time the
string is not being displayed.

                             // 10.11 //

The StringBuilder and StringBuffer classes are similar to the String class except that the 
String class is immutable. The StringBuilder class is similar to StringBuffer except that
the methods for modifying the buffer in StringBuffer are synchronized, meaning that only one
task is allowed to execute the methods. 
java.lang.StringBuilder
All the modification methods except setCharAt do two things:
   Change the contents of the string builder (if you change a string with these methods, the
   string will literally change)
   Return the reference of the string builder (and that changed string will now be referenced)

*/