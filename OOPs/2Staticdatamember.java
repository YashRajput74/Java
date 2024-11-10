	class Staticdatamember
{
	int id; //non-static data member, global variable, instance data member, class level variable--jitne baar object banaoge utne baar memory alot hogi
	String name;
	int Salary;
	static String cname="Google";//static class ka part hota hai, aur non static object ka part hota hai
	
	//void store()//no return type with no argument
	void store(int id1, String name1, int Salary1)//no return type with argument //Store is user-defined
	{
		id=id1;
		name=name1;
		Salary=Salary1;
	}
	
	void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(Salary);
		System.out.println(cname);
	}
	
	public static void main(String args[])
	{
		Google e1= new Google();
		e1.store(101,"Vijay",4542);
		e1.display();
		
		Google e2= new Google();
		e2.store(102,"Ajay",4552);
		e2.display();
		
		Google e3= new Google();
		e3.store(103,"Priya",45452);
		e3.display();
	}
}
*/