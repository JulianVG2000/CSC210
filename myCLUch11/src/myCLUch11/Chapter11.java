package myCLUch11;

public class Chapter11 {

	public static void main(String[] args) {
		// Inheritance and Polymorphism

	}

}
/*
                             // 11.2 //

Inheritance enables you to define a superclass and later extend it to more subclasses.
A subclass inherits accessible data fields and methods from its superclass and may also add
new data fields and methods.
public class (subclass) extends (superclass)
Private data fields in a superclass cannot be used directly in a subclass, but they can be 
accessed/mutated through public getter/setter methods if defined in the superclass.
subclass is not a subset of the superclass.
Java only allows single inheritance: only one parent class can be defined.

                             // 11.3 //

The keyword super refers to the superclass and can be used to invoke the superclass's methods
and constructors.
To call a superclass's constructor, this must be the first statement of the subclass's 
constructor: 
   super()  or  super(parameters)
A subclass first invokes its superclass constructor before performing its own tasks, and the
superclass might do this until the last constructor along the inheritance hierarchy is called,
this is called constructor chaining. (constructors in the superclass will be called first 
before the subclasses).
To reference methods with super, use
   super.method(parameters)

                             // 11.4 //

To override a method, the method must be defined in the subclass using the same signature 
and the same return type as in its superclass.
A static method cannot be overridden. If it is attempted to be overridden in a subclass, the
method defined in the superclass is hidden. To access this hidden method, use
   SuperClassName.staticMethodName

                             // 11.5 //

It is optional to place @Override before an overridden method called override annotation to 
avoid mistakes.

                             // 11.6 //

Every class in Java is descended from the java.lang.Object class.
The toString() method from the Object class just returns the hexadecimal memory address of 
the object (loan.toString()). Usually you want to override the toString() method to actually
output a String instead.

                             // 11.7 //

A class defines a type: a type defined by a subclass (Circle) is a subtype of a supertype 
(Geometric Objects)
Polymorphism (many forms) means that a variable of a supertype can refer to a subtype object.

                             // 11.8 //

The type that declares a variable is called the variable's declared type:
   Object o = new GeometricObject();  // o's declared type is Object
The actual type of the variable is the actual class for the object referenced by the variable:
   //  o's acutal type is GeometricObject
For the statement:
   System.out.println(o.toString());
the toString() method that is invoked by o is determined by o's actual type, this is known as
dynamic binding.
The JVM will search from the subclasses to the superclasses when searching for which method to
choose.
The declared type of the reference variable decides which method to match at compile time. The
compiler finds a matching method according to the parameter type, number of parameters, and 
order of the parameters at compile time. A method may be implemented in several classes along
the inheritance chain. The JVM dynamically binds the implementation of the method at runtime,
decided by the actual type of the variable.

                             // 11.9 //

These statements are the same:
   m(new Student());
   and
   Object o = new Student(); // implicit casting (upcasting)
   m(o);
Object o = new Student() is legal because an instance of Student is an instance of Object.
However, an instance of an Object isn't an instance of a Student. Thus, to assign the object
reference o to a variable of the Student type, use explicit casting (downcasting):
   Student b = (Student)o;
Note: the object to be cast must be an instance of the subclass, otherwise a 
ClassCastException will occur.
To ensure that the object is an instance of another object before a casting, use instanceof 
operator:
   Object myObject = new Circle();
   if (myObject instanceof Circle) {
   System.out.println("The circle diameter is " + ((Circle)myObject).getDiameter());
   }
Note: you could just define Object o = new Student() as Student o = new Student(), but it is
good practice to define variables with a supertype and use casting instead.
Explicit casting is needed for ((Circle)myObject).getDiameter() because getDiameter method is
not available in the Object class.

Casting an object reference does not create a new object:
   Object o = new Circle();
   Circle c = (Circle)o; // no new object is created
Now reference variables o and c point to the same object.

                             // 11.10 //

Like the toString() method, the equals(Object) method is another useful method defined in the
Object class:
   public boolean equals(Object obj) {
     return (this == obj);
   } // default implementation of the equals method in the Object class
The syntax for invoking it is
   object1.equals(object2); // This tests whether two reference variables point to the same
   object
The equals method in the String class is inherited from the Object class and is overridden in
the String class to test whether two strings are identical in content. The Date class also 
overrides the equals method.

                             // 11.11 //

An ArrayList object can be used to store a list of objects in an array of a fixed size once
created (you can store an unlimited number of objects).
The following creates an ArrayList and assigns its reference to variable cities or dates:
   ArrayList<String> cities = new ArrayList<String>();
   ArrayList<java.util.Date> dates = new ArrayList<java.util.Date>();
You could also do 
   ArrayList<String> cities = new ArrayList<>();
   ArrayList<java.util.Date> dates = new ArrayList<>();
because uses type inference, where String & java.util.Date is implied on the right side.

For the integer ArrayList, use
   ArrayList<Integer> list = new ArrayList<>();
which you can sort by using:
   java.util.Collections.sort(arraylist)

                             // 11.14 //

A protected member of a class can be accessed from a subclass.

                             // 11.15 //

Neither a final class nor a final method can be extended. A final data field is a constant.
*/