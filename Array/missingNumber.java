/*
1. Find the missing number in an array
Given an array of integers from 1 to 100, find the missing number.
*/
import java.util.Arrays;
class missingNumber
{
	public static void main(String args[])
	{
		int arr[]= new int[99];
		int missingNumber=43;
		int flag=0;
		for(int i=1;i<=100;i++)
		{
			if(i==missingNumber)
			{
				flag=1;
			}
			else if(flag==0)
			{
				arr[i-1]=i;
			}
			else if(flag==1)
			{
				arr[i-2]=i;
			}
		}
		int count=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=count)
			{
				System.out.println("The missing Number is: "+count);
				break;
			}
			count++;
		}
	}
}