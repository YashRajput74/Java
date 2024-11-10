/*
OOP's approach: It's an approach, any programming language can follow this approach.
1. Encapsulation: {Cover(Protection)} It is representation of class.
	1. Class: It is implementation of encapsulation.
	2. Object: It is just buffer area to store non-static data member.
	3. Reference Variable: It holds the reference id.
	4. Reference id: It is denoted as memory allocation.
	5. Non-static Data Member: 
	6. Static Data Member
	7. Non Static Member Function
	8. Static Member Function
	9. This Keyword
	10. This() Method
	11. Constructor
	12. Default Constructor
	13. Parameterized Constructor
	14. Constructor Chaining
	15. init Block
	16. Static Block
	
2. Polymorphism: {Poly: Many||Morphism:Form}:One Person different Form
3. Inheritance: Generational Trauma passing on to next Generation
4. Abstraction: High Complexity and Functionality

7 Golden Rule:
1. Data Shadowing
2. Method Overloading
3. Data Hiding
4. Method Overiding
5. Method Hiding
6. Upcasting
7. Downcasting
*/

/*
	Java is Case Sensitive.
	variable 
	data type: which type of data is to stored in a variable
	method dependent hota hai
	aur function independent hota hai
*/
class Google
{
	int id; //non-static data member, global variable, instance data member, class level variable
	String name;
	int Salary;
	String cname;
	
	//void store()//no return type with no argument
	void store(int id1, String name1, int Salary1, String cname1)//no return type with argument //Store is user-defined
	{
		id=id1;
		name=name1;
		Salary=Salary1;
		cname=cname1;
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
		Google e1= new Google();//new kisi bhi class ko memory deta hai...aur apne left side wale ko memory deta hai;
		e1.store(101,"Vijay",4542,"Google");
		e1.display();
		
		Google e2= new Google();
		e2.store(102,"Ajay",4552,"Google");
		e2.display();
		
		Google e3= new Google();
		e3.store(103,"Priya",45452,"Google");
		e3.display();
	}
}

/*
	class Google static data member
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
		Google e1= new Google();//new kisi bhi class ko memory deta hai...aur apne right side wale ko memory deta hai;
		e1.store(101,"Vijay",4542);
		e1.display();
		
		Google e2= new Google();//new kisi bhi class ko memory deta hai...aur apne right side wale ko memory deta hai;
		e2.store(102,"Ajay",4552);
		e2.display();
		
		Google e3= new Google();//new kisi bhi class ko memory deta hai...aur apne right side wale ko memory deta hai;
		e3.store(103,"Priya",45452);
		e3.display();
	}
}
*/