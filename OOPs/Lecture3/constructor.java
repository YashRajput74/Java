/*
	Constructor is a method.
	It is named after the class for which it is working.
	The three differences in normal method and a constructor are:
	-Constructor is always named after class whereas a normal method can have any name.
	-Constructor does not have return type because it returns the refernce variable of the object which is created and we know that no method can have two return types.
	-Constructor is called by JVM whereas a normal method is called by us.
	Note: reference variable is the address of the memory in which data is stored.
*/

class constructor
{
	int id;
	String name;
	int salary;
	String cname="TCS";
	
	constructor()
	{
		id=101;
		name="Vijay";
		salary=5242;
	}
	
	void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(cname);
	}
	public static void main(String args[])
	{
		constructor emp1=new constructor();
		emp1.display();
		
		constructor emp2=new constructor();
		emp2.display();
		
		constructor emp3=new constructor();
		emp3.display();
	}
}

/*
	what we used here was a non parametrized constructor also known as Non-Parameterized constructor.
	Default constructor(Non-Parameterized constructor): Non-Parameterized constructor is used when we have to do static initialization
	Static initialization: When we initialize the non-static data member for same data a number of times.
*/