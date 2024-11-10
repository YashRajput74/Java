/*
	Method Hiding: Whenever the parent class and child class both are having same static method then this concept is known as Method Hiding.
	super or this ham static aur main mein use nahi kar sakte.
*/

class methodHiding
{
	static void show()
	{
		System.out.println("show from parent class");
	}
}

class Child4 extends methodHiding
{
	static void show()
	{
		System.out.println("show from child4");
	}
	public static void main(String args[])
	{
		show();
		methodHiding.show();
	}
}