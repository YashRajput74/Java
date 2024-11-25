/*
	Polymorphism:One name and many Behaviour
	It reduces the complexity of an object
	Example: Println prints any data type.
	There are two types of Polymorphism:
	-Compile Time Polymorphism
	-Run Time Polymorphism
	--Compile Time Polymorphism: Whenever an object is bound with their functionality at compile time, this is known as Compile Time Polymorphism or Early Binding.
	All object oriented programming language achieve compile time polymorphism in two ways:
	---Function Overloading
	---Operator Overloading
	--Run Time Polymorphism: Whenever an object is bound with their functionality at run time, this is known as Run Time Polymorphism or Late Binding. All object oriented programming language achieve run time polymorphism through Function Overriding.
	Note: Java does nnot support Operaator Overloading Explicitly.
		Ex: 20+30=50;"Good"+"morning"="Goodmorning" This is done internally.
		Meanwhile in C++ i++ and i+5 both are possible but not in Java, because Java does not support Compile Time Polymorphism.
	Method Overloading: Whenever the same class having the multiple method with the same name but different different argument then this concept is known as Method Overloading.
*/

class MethodOverloading
{
	void add(int x, int y)
	{
		System.out.println(x+y);
	}
	void add(int x, int y, int z)
	{
		System.out.println(x+y+z);
	}
	void add(int x, int y, int z, int a)
	{
		System.out.println(x+y+z+a);
	}
	public static void main(String args[])
	{
		MethodOverloading m1= new MethodOverloading();
		m1.add(10,20);
		m1.add(10,20,30);
		m1.add(10,20,30,40);
	}
}