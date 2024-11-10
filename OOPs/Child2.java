/*
	Data hiding: whenever the parent class and child class both are having same data member than this concept is known as data hiding. Always goes to priority child class data member.
*/
class Inheritance2
{
	int x=10;
}

class dataHiding extends Inheritance2
{
	int x=20;
	
	void show()
	{
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);//parent class ke object ko represent karta hai.
	}
}

class child2 extends dataHiding
{
	public static void main(String args[])
	{
		child2 c1=new child2();
		c1.show();
	}
}