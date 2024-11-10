/*
	30
	10
	default constructor
	60
*/
class QFive
{
	QFive(int x, int y, int z)
	{
		this();
		System.out.println(x+y+z);
	}
	QFive(int x, int y)
	{
		System.out.println(x+y);
	}
	QFive(int x)
	{
		this(10,20);
		System.out.println(x);
	}
	QFive()
	{
		this(10);
		System.out.println("Default Constructor");
	}
	public static void main(String args[])
	{
		new QFive(10,20,30);
	}
}