/*
Question:

Write a Java program that uses method overloading to perform calculations on numbers. The program should have a class called Calculator with overloaded calculate methods for:

1. Two integers (adds them)
2. Three integers (multiplies them)
3. Two doubles (averages them)
4. A single string (returns the string length)

The program should also have a main method to test the calculate methods.

Example Output:


Sum: 7
Product: 24
Average: 3.5
String length: 5


Note:

- Implement the calculate methods using method overloading.
- Use System.out.println to print the results in the main method.
*/

class Calculator
{	
	void calculate(int x, int y)
	{
		System.out.println("The addtion of two integers is: "+(x+y));
	}
	void calculate(int x, int y, int z)
	{
		System.out.println("The multiplication of three intergers is: "+(x*y*z));
	}
	void calculate(double a, double b)
	{
		System.out.println("The average of two doubles is: "+((a+b)/2));		
	}
	void calculate(String s)
	{
		System.out.println("The length of the string is: "+(s.length()));
	}
	public static void main(String args[])
	{
		Calculator c1=new Calculator();
		c1.calculate(10,20);
		c1.calculate(10,20,30);
		c1.calculate(3.0,4.0);
		c1.calculate("Yash");
	}
}