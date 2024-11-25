//Init Block: When we need a statement that is repeating itself in every constructor than we use init block. Init Block has no name.
class InitBlock
{
	{
		System.out.println("Init Block");
	}
	InitBlock()
	{
		System.out.println("Default Constructor");
	}
	InitBlock(int x)
	{
		System.out.println(x);
	}
	InitBlock(int x, int y)
	{
		System.out.println(x+y);
	}
	{
		System.out.println("Second Init Block");
	}
	public static void main(String args[])
	{
		new InitBlock();
		new InitBlock(10);
		new InitBlock(10,20);
	}
}