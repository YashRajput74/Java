class ParameterizedConstructor
{
	int id;
	String name;
	int salary;
	String cname="TCS";
	
	ParameterizedConstructor(int id, String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(cname);
	}
	public static void main(String args[])
	{
		ParameterizedConstructor emp1=new ParameterizedConstructor(100,"Vijay",5252);
		emp1.display();
		
		ParameterizedConstructor emp2=new ParameterizedConstructor(101,"Ajay",4242);
		emp2.display();
		
		ParameterizedConstructor emp3=new ParameterizedConstructor(102,"Sushant",6262);
		emp3.display();
	}
}

/*
	what we used here was a non parameterized constructor also known as parameterized constructor.
	Argument is passed trough the parameterized constructor.
*/