/*
16. How do you find the sum of elements in an array?
Ans. To find the sum of elements in an array in Java, you can iterate through the array using a loop and accumulate the values into a sum variable.
*/
class SumOfArray
{
	public static void main(String args[])
	{
		int n[]={10,20,30,40,50};
		int sum=0;
		for(int i=0;i<n.length;i++)
		{
			sum+=n[i];
		}
		System.out.println(sum);
	}
}