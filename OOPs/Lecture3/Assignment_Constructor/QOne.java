/*
	default constructor
	10
	30
	60
*/
class QOne
{
	QOne(int x, int y, int z)
	{
		this(10,20);
		System.out.println(x+y+z);
	}
	QOne(int x, int y)
	{
		this(10);
		System.out.println(x+y);
	}
	QOne(int x)
	{
		this();
		System.out.println(x);
	}
	QOne()
	{
		System.out.println("Default Constructor");
	}
	public static void main(String args[])
	{
		new QOne(10,20,30);
	}
}