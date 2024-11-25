/*
20. How do you search for an element in an array?
Ans. To find the same element in an array in Java, you can iterate through the array and keep track of the same value you encounter. 
*/
class SameElementOfArray
{
	public static void main(String args[])
	{
		int n[]={10,20,30,40,50};
		int sameElement=30;
			for(int i=0;i<n.length;i++)
			{
				if(n[i]==sameElement)
				{
					System.out.println(i);
					break;
				}
			}
	}
}