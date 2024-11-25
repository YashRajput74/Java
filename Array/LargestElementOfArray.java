/*
18. How do you find the maximum element in an array?
Ans. To find the maximum element in an array in Java, you can iterate through the array and keep track of the largest value you encounter.
*/
class LargestElementOfArray
{
	public static void main(String args[])
	{
		int n[]={10,20,30,40,50};
		int largestElement=n[0];
		for(int i=1;i<n.length;i++)
		{
			if(n[i]>n[i-1])
			{
				largestElement=n[i];
			}
		}
		System.out.println(largestElement);
	}
}