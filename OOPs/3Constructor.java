/*
	30
	60
	default constructor// when hamko non static data member ko static data member ki tarah behave karana hota hai
	10
*/
/*
-Constructors are used to doing tasks which you want to do only once in the life cycle of an object.
-If you want to provide certain common resources to the each object of your class at the time of creation of that object then also use constructor.
-There are two types of constructor: Parameterized and Non-parameterized.
-No class can exist without constructor.
-If there is no constructor in a class then one non-parametrized (default)constructoris inserted in that class by the compiler.
-Constructors are by nature static.
-Whenever you want to initialize the data members of the each object with a same value then always use default constructor and this process is known as static initialization of non-static data members.
-Parametrized Constructor: Whenever you want to initialize the data members of the each object with different- different values then always use parametrized constructor and this process is known as dynamic initialization of non-static data members.
*/
class constructor
{
	
	constructor(int x)
	{
		this(20,30);
		System.out.println(x);
	}
	constructor()
	{
		System.out.println(x+y);
	}
	constructor(int x,int y)
	{
		this(10,20,30);
		System.out.println("default constructor");
	}
	constructor(int x,int y,int z)
	{
		this();
		System.out.println(x+y+z);
	}
	public static void main(String args[])
	{
		new constructor(10);
	}
}