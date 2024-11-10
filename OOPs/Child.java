/*
	Reuse a code in different class...that is inheritance.
	5 types of inheritance:
	but java uses 3 only and somehow we are able to support the 4th one. Java is unable to support multiple inheritance(We can do this with abstraction:interface).
	Runtime mein hi hoga inheritance.
	
*/
/*
	Two major advantages of Inheritance are: Code reusablity and Dynamic Binding(Runtime Polymorphism) by Method Overloading.
	Java  does not support multiple inheritance.
	Inheritace occur at runtime only in compile time java converts our source code into bbyte code.
	When we create the object of a child class the oarent class object will not be created automatically.
	By default all the data members and member functions of a parent class are available to child if they are not private.
*/

class Inheritance
{
	int x;
	int y;
	
	void show()
	{
		System.out.println(x);
		System.out.println(y);
	}
}

class child extends Inheritance
{
	void get(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public static void main(String args[])
	{
		child c1=new child();
		c1.get(10,20);
		c1.show();
	}
}