/*
Data member in Inheritance:
Data Hiding: Whenever the parent class and child class both are having some non static data members than this concept is known as Data-Hiding.
Child class data member has high priority.
Super: Holds the parent class object.
*/

class Base
{
	int x=10;
}
class DataHiding extends Base
{
	int x=20;
	void show()
	{
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
	public static void main(String args[])
	{
		DataHiding c1=new DataHiding();
		c1.show();
	}
}