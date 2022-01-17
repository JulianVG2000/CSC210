package myCLUch8;

public class MultiDimArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
                             // 8.1 //

Two-dimensional arrays can represent data in a table or a matrix.

                             // 8.2 //

Declare two-dimensional arrays using:
   elementType[][] arrayRefVar;
To declare, create, and assign one, use:
   elementType[] arrayRefVar = new elementType[arraySize][arraySize]
where the first [arraySize] represent the rows; second, columns. Only
the first arraySize needs to be defined (if you want to create a 
ragged array, you can separately define each column length uniquely).
To assign values to the elements:
   // for each element
   arrayRefVar[index][index] = value;
   OR
   // if we had a 4x3 matrix
      int[][] matrix = {
         {1, 2, 3},
         {4, 5, 6},
         {7, 8, 9},
         {10, 11, 12}
      };

Each row in a two-dimensional array is itself an array:
   matrix.length is 4
   martix[0].length = matrix[1].length = ... = matrix[3].length = 3

                             // 8.3 //

Nested for loops are often used to create a two-dimensional array.

                             // 8.4 //

Passing two-dimensional arrays also only passes the reference of an
array to the method.

                             // 8.8 //

A two-dimensional array consists of an array of one-dimensional
arrays and a three-dimensional array consists of an array of two-
dimensional arrays.

*/