/*
Questions for practice:
	default constructor
	10
	30
	60
	
	10
	30
	60
	default constructor
	
	30
	60
	default constructor
	10
	
	60
	default constructor
	10
	30
	
	30
	10
	default constructor
	60
*/

class ConstructorChaining
{
	ConstructorChaining(int x, int y, int z)
	{
		this(10,20);
		System.out.println(x+y+z);
	}
	ConstructorChaining(int x, int y)
	{
		this(10);
		System.out.println(x+y);
	}
	ConstructorChaining(int x)
	{
		this();
		System.out.println(x);
	}
	ConstructorChaining()
	{
		System.out.println("Default Constructor");
		//The constructorwith no this is the first one to run.
	}
	public static void main(String args[])
	{
		new ConstructorChaining(10,20,30);//Anonymous object: When we don't have any data member or method we use this.
		//Also the constructor here will run last.
	}
}
