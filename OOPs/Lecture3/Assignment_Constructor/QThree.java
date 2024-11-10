/*
	30
	60
	default constructor
	10
*/
class QThree
{
	QThree(int x, int y, int z)
	{
		this(10,20);
		System.out.println(x+y+z);
	}
	QThree(int x, int y)
	{
		System.out.println(x+y);
	}
	QThree(int x)
	{
		this();
		System.out.println(x);
	}
	QThree()
	{
		this(10,20,30);
		System.out.println("Default Constructor");
	}
	public static void main(String args[])
	{
		new QThree(10);
	}
}