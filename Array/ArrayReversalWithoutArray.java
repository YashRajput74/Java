/*
7. Reverse an array without using additional space
Given an array of integers, reverse it without using additional space.
*/
import java.util.Arrays;
class ArrayReversalWithoutArray
{
	public static void main(String args[])
	{
		int arr[]={10,20,30,40,50,60,70};
		int m;
		int n=arr.length-1;
		if(arr.length%2!=0)
		{
			m=(arr.length-1)/2;
		}
		else
		{
			m=arr.length/2;
		}
		for(int i=0;i<m;i++)
		{
			arr[i]=arr[i]+arr[n-i];
			arr[n-i]=arr[i]-arr[n-i];
			arr[i]=arr[i]-arr[n-i];
		}
		System.out.println(Arrays.toString(arr));
	}
}