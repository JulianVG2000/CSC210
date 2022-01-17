package myCLUch9;

public class Chapter9 {

	public static void main(String[] args) {
		// Objects and Classes
		// Listing 9.1
		// Listing 9.3 & Listing 9.4
		// Listing 9.6 & Listing 9.7
		// Listing 9.10 // how to pass an object to methods
		

	}

}
/*
                             // 9.2 //

A class defines the properties and behaviors for objects.
The state of an object is represented by data fields (object "circle" is characterized by data
field "radius").
The behavior of an object is defined by methods (getArea(), setRadius(), etc.)
Objects of the same type are defined using a common class (a contract that defines what an 
object's data fields and methods will be through variables). An object is an instance of a 
class.
Classes can use methods called constructors to initialize the data fields of objects.
In Unified Modeling Language (UML): For the circle class we have
   Data fields are written like
   dataFieldName: dataFieldType
      radius: double
   Constructors are written like
   ClassName(parameterName: parameterType)
      Circle(newRadius: double)
   Methods are written like
   methodName(parameterName: parameterType): returnType
      setRadius(newRadius: double): void
Note: the + sign indicates public modifier

                             // 9.3 //

The circle class is a client of the main class because it is used by the main class.
The .java file name is the name of the public class, which a file can only have one of. 
However, when the file is compiled, a .class file will be generated for each class in the code
Note: the constructor and methods in the TV class are defined public so they can be accessed
from other classes

                             // 9.4 //

Constructor: must have same name as the class, they have no return type (not even void), are
invoked using the new operator (new ClassName(arguments)) when an object is created.
Constructors can be overloaded.
You usually write a no-arg constructor (Circle()) in the class, but if you don't, a default
constructor, which is just a public no-arg constructor, is automatically assigned to the class

                             // 9.5 //

A class is a reference type, meaning that a variable of the class type can
reference an instance of the class. Reference variables are defined by:
   ClassName objectRefVar;
      Circle myCircle; // declares the variable myCircle to be of the Circle type
The variable myCircle can reference a Circle object.
   myCircle = new Circle(); // creates an object and assigns its reference to myCircle
To declare an object reference variable, create an object, and assign an object reference to
the variable:
   ClassName objectRefVar = new ClassName();
     Circle myCircle = new Circle(); // variable myCircle holds a reference to a Circle object
An object's data and methods can be accessed through the dot (.) operator via the object's 
reference variable:
   objectRefVar.dataField
      myCircle.radius  // radius is an instance variable
   objectRefVar.method(arguments)
      myCircle.getArea() // getArea is an instance method
The object on which an instance method is invoked is called a calling object

The default value of a data field is null for a reference type, 0 for a numeric type, false
for a boolean type, and \u0000 for a char type. However, Java assigns no default value to a 
local variable INSIDE A METHOD. Note: reference data fields are data fields ("name" of Student
class) of a type that is a predefined Java class (String), and if it doesn't reference any
object (like it doesn't equal anything), then the data field holds the special Java value null
For a variable of a reference type, the value is a reference to where an object is located in
the memory. Also, the reference of one variable is assigned to the other variable. If you had
two completely different reference variable c1 and c2, the assignment statement c1 = c2 would
throw whatever object c1 was assigned to so now c1 and c2 reference the same exact object.

NullPointerException occurs if you invoke a method on a reference variable with a null value.

                             // 9.6 //

The Java API holds useful classes:
   The Date Class
      java.util.Date date = new java.util.Date();
      date.getTime();
   The Random Class
      Random random1 = new Random(3);
      random1.nextInt(1000);
         Note: a seed is a number used to initialize a random number generator. When you
         create a Random object, you have to specify a seed or use the default seed. The no-
         arg constructor creates a Random object using the current elapsed time as its seed. 
         If two Random objects have the same seed, they will generate identical sequencese of
         numbers.
         Note: although Math is a class, you can do Math.random() because the methods in the 
         Math class are static (not public).
   The Point2D Class
      import javafx.geometry.Point2D;
      Point2D p1 = new Point2D(5, 2);
      Point2D p2 = new Point2D(2, 6);
      p1.toString();
      p1.distance(p2); // distance between p1 and p2

                             // 9.7 //

Changes in circle1's radius do not affect circle2's radius. If you want all the instances of 
a class to share data, use static variables. Because the values of static variables are 
stored in a common memory location, if one object changes the value of a static variable, all
objects of the same class are affected. Static methods can be called without creating an 
instance of the class. Note: static variables and methods are underlined in the UML class
diagram. Constants should be declared as "final static." Static methods and static data can
be accessed from a reference variable or from the class name (But they generally want you
to use the class name).
Static methods cannot access instance methods or data fields. In order to do that, a RefVar
referencing the class must be created, and then use that RefVar to reference the data fields
and methods. Note: you can reference instance methods and data fields in a static methods
with defining a RefVar IF you put the instance methods and data fields in some static class
like Math.

                             // 9.8 //

Package-private (or package-access): the visibility modifier "public" can be used on classes,
methods, and data fields to denote that they can be accessed from any other classes. If no
visibility modifier is used, then by default the classes, methods, and data fields are 
accessible by any class in the same package.
The "private" modifier makes methods and data fields accessible only from within its own 
class.
The private modifier restricts access to its defining class, the default modifier (if a
class, method, or data field has defined no visibility modifier) restricts access to a 
package, and the public modifier enables unrestricted access. If a class is not defined as 
public, it can be accessed only within the same package.
If you want to prevent the user from creating an instance of a class, use a private 
constructor.

                             // 9.9 //

Data field encapsulation: to prevent direct modifications of data fields, you should declare
the data fields private. To retrieve and modify these private data fields outside a class, 
we use a getter (or accessor) method to retrieve them and a setter (or mutator) method to
modify them.
A getter method is defined by:
   public returnType getPropertyName()
   If returnType is boolean:
      public boolean isPropertyName()
A setter method is defined by:
   public void setPropertyName(dataType propertyValue)
The - sign indicates a private modifier in UML.

                             // 9.10 //

Passing an object to a method is to pass the reference of the object.
Pass-by-sharing: the object referenced in the method is the same as the object being passed.

                             // 9.11 //

An array can hold objects as well as primitive type values.
To declare and create an array of ten Circle objects:
   Circle[] circleArray = new Circle[10];
   to initialize circleArray:
      for (int i = 0; i < circleArray.length; i++) {
        circleArray[i] = new Circle();
      }
When an array of objects is created using the new operator, each element in the array is a
reference variable with a default value of null.

                             // 9.12 //

Immutable object: a created object whose contents cannot be changed once the object has been
created. (a private object)
Immutable class: the class of an immutable object. (if a class is immutable, then all its
data fields must be private and it cannot contain public setter methods for any data fields.
However, this isn't true vice-versa. Having a Date accessor method can reference a data field
that is mutable)
Thus, for a true immutable class:
   All data fields must be private
   There can't be any mutator methods for data fields
   No accessor methods can return a reference to a data field that is mutable

                             // 9.13 //

Class variable (data fields): instance and static variables in a class. (its scope is the 
entire class)
Local variable: variable defined inside a method. (its scope is the method)
If a local variable has the same name as a class's variable, the local variable takes 
precedence and the class's variable with the same name is hidden (GENERALLY do this ONLY for
method parameters to avoid confusion)

                             // 9.14 //

The "this" keyword is the name of a reference that an object can use to refer to itself. You
can use the "this" keyword to reference the object's instance members (like radius: 
"this.radius" is the same as just "radius").
In order to reference a hidden data-field in a method (more specifically a setter method) in
order to set a new value to it, there a two ways:
   1) If the hidden variable is static, then just use "ClassName.staticVariable" to reference
   it
   2) Use the "this" keyword
The "this" keyword can be used to invoke another constructor of the same class.
*/