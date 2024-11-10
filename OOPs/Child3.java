/*
	Method overiding: Whenever the parent class and child class both are having same non static method/function than this concept is known as method overriding. 
*/

class methodOveriding
{
	
	void show()
	{
		System.out.println("Show from methodOveriding");
		System.out.println(super.x);//parent class ke object ko represent karta hai.
	}
}

class child3 extends dataOverriding
{
	void show()
	{
		System.out.println("show from child3");
	}
	public static void main(String args[])
	{
		child3 c1=new child3();
		c1.show();
	}
}