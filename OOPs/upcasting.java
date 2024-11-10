/*
upcasting: jab child ka refernce id
whenver we get back
refernce variable aur object mein kya differnce hai

same class ka refernce id same class ke toh object(left aur right side differnet class)
right is refernce id
upcasting karne ke baad child apna personal method nahi chala sakta
*/

class upcasting
{
	void show()
	{
		System.out.println("show from parent class");
	}
}

class Child5 extends upcasting
{
	void show()
	{
		System.out.println("show from child4");
	}
	public static void main(String args[])
	{
		upcasting b=new Child5();
		b.show();
	}
}