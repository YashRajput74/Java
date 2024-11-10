/*
	10
	30
	60
	default constructor
*/
class QTwo
{
	QTwo(int x, int y, int z)
	{
		this(10,20);
		System.out.println(x+y+z);
	}
	QTwo(int x, int y)
	{
		this(10);
		System.out.println(x+y);
	}
	QTwo(int x)
	{
		System.out.println(x);
	}
	QTwo()
	{
		this(10,20,30);
		System.out.println("Default Constructor");
	}
	public static void main(String args[])
	{
		new QTwo();
	}
}