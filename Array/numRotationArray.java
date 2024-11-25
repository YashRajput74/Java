/*
45. How do you find the number of rotations in an array?
Ans.
*/

class numRotationArray
{
	public static void main(String args[])
	{
		int arr[]={40,50,60,10,20,30};
		int i;
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[i-1])
			{
				break;
			}
		}
		System.out.println(i+1);
	}
}