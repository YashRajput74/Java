/*
	init block: init block is always executed before the any constructor whenever that constructor is used for creating a new object.
	The complete code of init block is inserted into the first line of any constructor whenever that constructor is used to create a new object.
	If you want to do a particular task in each constructor then rather than putting the code of that task in each constructor, make an init block and put the code of that task into the init block.
	init then constructor then method;
*/

class Initblock
{
	{//init block doesn't need any keyword
		System.out.println("init block");
	}
	Initblock()
	{
		System.out.println("default constructor");
	}
	Initblock(int x)
	{
		System.out.println(x);
	}
	Initblock(int x, int y)
	{
		System.out.println(x+y);
	}
	{
		System.out.println("second init block");
	}
	Initblock(int x, int y, int z)
	{
		System.out.println(x+y+z);
	}
	
	public static void main(String args[])
	{
		new Initblock();//anonymous object
		new Initblock(10);//anonymous object
		new Initblock(10,20);//anonymous object
		new Initblock(10,20,30);//anonymous object
	}
}