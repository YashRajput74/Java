/*
upcasting: jab child ka refernce id
whenver we get back
refernce variable aur object mein kya differnce hai

same class ka refernce id same class ke toh object(left aur right side differnet class)
right is refernce id
upcasting karne ke baad child apna personal method nahi chala sakta
*/

class downcasting
{
	void show()
	{
		System.out.println("show from parent class");
	}
}

class Child6 extends downcasting
{
	void show()
	{
		System.out.println("show from child4");
	}
	void display()
	{
		System.out.println("displayfrom child");
	}
	public static void main(String args[])
	{
		downcasting b=new Child6();//upcasting
		b.show();
		Child6 c=(Child6)b;
		c.display();//downcasting
	}
}