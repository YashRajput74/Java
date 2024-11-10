/*
Data- Shadowing: Whenever the global variable and local variable both are the same then this concept is known as data-shadowing. It always gives priority to local variable.

This-keyword: It holds the cureent class object. This se ham non-static data member ko acccess kar rahe hai.
*/


/*
class ThisKeyword
{
	int id;
	String name;
	int Salary;
	static String cname="Google";
	
	void get(int id, String name, int Salary)
	{
		id=id;
		name=name;
		Salary=Salary;
	}
	void show()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(Salary);
		System.out.println(cname);
	}
	public static void main(String args[])
	{
		ThisKeyword emp1=new ThisKeyword();
		emp1.get(101,"Vijay",450);
		emp1.show();
	}
}
*/

/*
In the above code if we run the program we will find that the values in show method are not assigned and 0, null, 0, and Google are printed.
Why? because the global variable and local variables are same now this is data shadowing. because the compiler gives priority to local variable.
*/
class ThisKeyword
{
	int id;
	String name;
	int Salary;
	static String cname="Google";
	
	void get(int id, String name, int Salary)
	{
		this.id=id;
		this.name=name;
		this.Salary=Salary;
	}
	void show()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(Salary);
		System.out.println(cname);
	}
	public static void main(String args[])
	{
		ThisKeyword emp1=new ThisKeyword();
		emp1.get(101,"Vijay",450);
		emp1.show();
	}
}