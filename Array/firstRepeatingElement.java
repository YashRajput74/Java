/*
6. Find the first repeating element
Given an array of integers, find the first repeating element.
*/
class firstRepeatingElement
{
	public static void main(String args[])
	{
		int arr[]={10,20,30,40,20,50};
		outer:
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					break outer;
				}
			}
		}
	}
}