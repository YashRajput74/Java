/*
47. How do you find the number of inversions in an array?
Ans. Given an integer array arr[] of size n, find the inversion count in the array. Two array elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.
*/
import java.util.Arrays;
class numInversionArray
{
	public static void main(String args[])
	{
		int initArray[]={4,2,3,1};
		int count=0;
		for(int i=0;i<initArray.length;i++)
		{
			for(int j=i+1;j<initArray.length;j++)
			{
				if(initArray[i]>initArray[j])
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
}