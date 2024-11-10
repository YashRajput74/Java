/*
	static block
	init block
	second init block
	default constructor
	normal method
*/

class Initblockpriority
{
	static
	{
		System.out.println("static block");
	}
	{//init block doesn't need any keyword
		System.out.println("init block");
	}
	Initblockpriority()
	{
		System.out.println("default constructor");
	}
	Initblockpriority(int x)
	{
		System.out.println(x);
	}
	Initblockpriority(int x, int y)
	{
		System.out.println(x+y);
	}
	{
		System.out.println("second init block");
	}
	void Initblockpriority()
	{
		System.out.println("normal method");
	}
	
	public static void main(String args[])
	{
		new Initblockpriority().Initblockpriority();//anonymous object
	}
}