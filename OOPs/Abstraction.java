/*
	Abstraction: --Hiding internal working and showing necessary details of object.
	--Show functionality, hide details.
	Abstraction is used to define standard where implementation vary from end user to end user. In case of abstraction two people play important role; first developer, who defines standard and second programmer, who provides body according to the requirement but code will always be executed by developer.
	Example: Photo Frame
	
	Abstraction can be achieved in two ways:
	--Via abstract classes
	--Via interface
	
	--Abstract class cannot be instantiated.
	--Only abstract classes can have abstract method, normal classes cannot have abstract methods.
	
	Note: It is not mandatory that at least one abstract method is required in an abstract class. It follows all the rules of a normal method except one thing that it cannot be instantiated.
*/

abstract class AbsMethod
{
	int x;
	int y;
	void show()
	{
		System.out.println(x);
		System.out.println(y);
	}
}

class Abstraction extends AbsMethod
{
	void get(int x, int y)
	{
		this.x=x;
		thi.y=y;
	}
	
	public static void main(String args[])
	{
		Abstraction c1=new Abstraction();
		c1.get(10,20);
		c1.show();
	}
}