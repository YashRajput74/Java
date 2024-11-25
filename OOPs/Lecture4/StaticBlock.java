//Static Block: When we need a statement to run once in a lifetime than we use static block. Static Block is given memory when class is loaded.
class StaticBlock
{
	static
	{
		System.out.println("Static Block");
	}
	{
		System.out.println("Init Block");
	}
	StaticBlock()
	{
		System.out.println("Default Constructor");
	}
	StaticBlock(int x)
	{
		System.out.println(x);
	}
	StaticBlock(int x, int y)
	{
		System.out.println(x+y);
	}
	{
		System.out.println("Second Init Block");
	}
	void StaticBlock()
	{
		System.out.println("Normal Method");
	}
	public static void main(String args[])
	{
		new StaticBlock();
		new StaticBlock(10);
		new StaticBlock(10,20).StaticBlock();
	}
}