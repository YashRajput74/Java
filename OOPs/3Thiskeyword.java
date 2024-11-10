class Thiskeyword
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
		Thiskeyword emp1=new Thiskeyword();
		emp1.get(101,"Vijay",450);
		emp1.show();
	}
}