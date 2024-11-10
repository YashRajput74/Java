/*
	60
	default constructor
	10
	30
*/
class QFour
{
	QFour(int x, int y, int z)
	{
		System.out.println(x+y+z);
	}
	QFour(int x, int y)
	{
		this(10);
		System.out.println(x+y);
	}
	QFour(int x)
	{
		this();
		System.out.println(x);
	}
	QFour()
	{
		this(10,20,30);
		System.out.println("Default Constructor");
	}
	public static void main(String args[])
	{
		new QFour(10,20);
	}
}