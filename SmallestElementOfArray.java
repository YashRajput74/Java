/*19. How do you find the minimum element in an array?
Ans. To find the minimum element in an array in Java, you can iterate through the array and keep track of the smallest value you encounter.
*/
class SmallestElementOfArray
{
	public static void main(String args[])
	{
		int n[]={10,20,30,40,50};
		int smallestElement=n[0];
		for(int i=1;i<n.length;i++)
		{
			if(n[i]<n[i-1])
			{
				smallestElement=n[i];
			}
		}
		System.out.println(smallestElement);
	}
}