/*
Inheritance: The two major advantages of Inheritance are:
			-Code Reusability
			-Dynamic Binding(Runtime Polymorphism)
Java does not support runtime Polymorphism
Whenever we create an object of a child class the parent class object will not be created automatically.
By default all the adata members and member funtions of a parent class are avialable to child class if they are not private.
If we make object of parent class then we can only access it but if we make object of child class we can access parent and child both data members.
Type of Inheritance in Java
1) Single
2) Multilevel
3) Hierarchical
4)Multiple
5)Hybrid
*/

class Base
{
	int x;
	int y;
	void show()
	{
		System.out.println(x);
		System.out.println(y);
	}
}
class Child extends Base
{
	void get(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public static void main(String args[])
	{
		Child c1=new Child();
		c1.get(10,20);
		c1.show();
	}
}