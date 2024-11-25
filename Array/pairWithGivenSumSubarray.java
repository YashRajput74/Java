/*
49. How do you find the number of pairs with a given sum in an array?
Ans.
*/
import java.util.Arrays;
class pairWithGivenSumSubarray
{
	public static void main(String args[])
	{
		int initArray[]={10,20,30,40,50};
		int sum=60;
		int count=0;
		for(int i=0;i<initArray.length;i++)
		{
			for(int j=i+1;j<initArray.length;j++)
			{
				if(initArray[i]+initArray[j]==sum)
				{
					count++;
				}
			}
		}
		System.out.print(count);
	}
}