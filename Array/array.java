/*
1. What is an array in Java?
Ans. In Java, an array is a data structure that allows you to store multiple values of the same type in a single variable. Arrays in Java are indexed, meaning each element in the array is associated with a specific position, starting from index 0 for the first element and going up to n-1 for an array with n elements.
2. How do you declare an array in Java?
Ans. There are two ways to declare an array in Java:
	-int[] numbers;
	-numbers = new int[5];
	-int[] numbers = {10, 20, 30, 40, 50};
3. What is the length of an array in Java?
Ans. In Java, the length of an array refers to the number of elements it can hold. You can access the length of an array using the length property, which returns an integer representing the total number of elements in the array.
int length = numbers.length;
4. How do you access an element in an array?
Ans. In Java, you access an element in an array using its index. The index of an array starts at 0 for the first element and goes up to n-1 where n is the length of the array.
5. What happens if you try to access an element outside the bounds of an array?
Ans. If you try to access an element outside the bounds of an array in Java, the program will throw an ArrayIndexOutOfBoundsException at runtime.
6. How do you sort an array in Java?
Ans. In Java, you can sort an array using the Arrays.sort() method provided by the java.util.Arrays class. This method sorts the elements of the array in ascending order by default. For arrays of primitive data types such as int, char, double, etc., you can directly use the Arrays.sort() method. You can also sort arrays of objects like String. The Arrays.sort() method uses the natural ordering of the elements. To sort an array in descending order, you can use Arrays.sort() in combination with the Collections.reverseOrder() method. However, this only works with arrays of objects (e.g., Integer, String, etc.).
7. What is a 2D array in Java?
Ans. A 2D array (two-dimensional array) in Java is an array of arrays. It is often used to represent a matrix or grid where data is organized in rows and columns. In a 2D array, each element is identified by two indices: one for the row and one for the column.
8. How do you declare a 2D array in Java?
Ans. To declare a 2D array in Java, you specify the data type, followed by two sets of square brackets [][], and then the array's name. You can declare it with or without specifying the size initially.
9. How do you access an element in a 2D array?
Ans. In Java, you can access an element in a 2D array using its row index and column index. The syntax to access an element is:arrayName[rowIndex][columnIndex].
12. How do you initialize an array in Java?
Ans. The assigning of values in an array is called initilization of an array in java.
15. How do you find the length of an array in Java?
Ans. In Java, you can find the length of an array using the .length property. This property provides the number of elements in the array. It's important to note that length is a property of the array object, not a method, so you do not use parentheses when accessing it.
*/
import java.util.Arrays;
class array
{
	public static void main(String args[])
	{
		int firstArray[]={10,20,30,40,50};//declaration-1 1D array
		System.out.println("First Array declared: "+Arrays.toString(firstArray));
		int[] secondArray;//declaration-2 1D array
		secondArray= new int[5];//declaration-2 1D array
		System.out.println("Second Array declared: "+Arrays.toString(secondArray));
		int length=firstArray.length;//length
		System.out.println("Length of first array: "+length);
		int firstnumber=firstArray[0];//access an element
		System.out.println("First number of first Array: "+firstnumber);
 		for(int i=0;i<firstArray.length;i++)
		{
			System.out.print("First array all of the elements are: ");
			System.out.println(firstArray[i]);
		}
		try {
            System.out.println(firstArray[5]);//accessing element out of bounds
        }
		catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
		int thirdArray[]={60,20,30,80,50,10};
		Arrays.sort(thirdArray);//sorting an array
		System.out.println("Sorted third array: " + Arrays.toString(thirdArray));
		int[][] fourthArray = {//declaration-1 2D array
		{1, 2, 3, 4},
		{5, 6, 7, 8},
		{9, 10, 11, 12}
		};
		int[][] fifthArray = new int[3][4];//declaration-2 2D array
		System.out.println("Element at row 2, column 3 of fourthArray: " + fourthArray[1][2]);//accessing element individually

        System.out.print("All elements in the fourthArray:");
        for (int i = 0; i < fourthArray.length; i++) {
            for (int j = 0; j < fourthArray[i].length; j++) {
                System.out.print(fourthArray[i][j] + " ");
            }
        }
		System.out.println();
	}
}