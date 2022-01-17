package myCLUch7;

public class SingleDimArrays {

	public static void main(String[] args) {
		// Listing 7.3
		// Listing 7.6 Linear Search
		// Listing 7.7 Binary Search
		// Listing 7.8 Sorting Algorithm

	}

}
/*
                             // 7.1 //

Single dimensional arrays are able to hold a collection of data that
one can use.

                             // 7.2 //

An arrays size is constant once it is created. An array reference
variable is used to access each component of the array, which is 
written in the form
   elementType[] arrayRefVar;
where all elements must share the same data type.

The declaration of an array variable only creates a storage location
for the reference to the array. To declare an array variable, create
an array, and assign the reference of the array to the variable:
   elementType[] arrayRefVar = new elementType[arraySize];
To assign values to the elements:
   arrayRefVar[index] = value;
Note: if arraySize is 10, it creates 10 individual element type. Thus,
the "index" when assigning values to the elements goes from 0 to 9.

The size of an array is:
   arrayRefVar.length

Instead of doing everything above, you could just write:
   elementType[] arrayRefVar = {value0, value1, ..., valuek};
to declare, create, and initialize an array.

Foreach loops display all the elements in an array (where "element"
must be declared as the same type as the arrayRefVar):
   for (elementType element: arrayRefVar) {
      // process
      }

                             // 7.5 //

You must copy the individual elements of an array into another array
if you want to copy the contents of one array into another.

                             // 7.6 //

The reference of an array is passed to the method, when passing an
array to a method, through pass-by-sharing:
   the array in the method is the same as the array being passed. So
   if we change the array in the method it also changes outside the
   method.

                             // 7.7 //

A method can also return an array, but note that only the reference
of the array is returned.

                             // 7.9 //

A variable number of arguments of the same type can be passed to a 
method and treated as an array.
The parameter in the method would be:
   typeName... parameterName
Note: only one variable-length parameter may be specified in a method.

                             // 7.10 //

If an array is sorted, binary search is more efficient than linear 
search for finding an element in the array.
Note: binary has elements that are sorted in increasing order.

                             // 7.11 //

In order to get elements in increasing order for binary search, use
sorting algorithm.

                             // 7.12 //

java.util.Arrays class has useful methods for array operations like
sorting and searching.

                             // 7.13 //

The main method can receive string arguments from the command line.

*/