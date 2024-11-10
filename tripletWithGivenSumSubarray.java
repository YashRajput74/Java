/*
50. How do you find the number of triplets with a given sum in an array?
Ans.
*/
import java.util.Arrays;
class tripletWithGivenSumSubarray
{
	public static void main(String args[])
	{
		int initArray[]={0,10,20,30,40,50};
		int sum=70;
		int count=0;
		for(int i=0;i<initArray.length;i++)
		{
			for(int j=i+1;j<initArray.length;j++)
			{
				for(int k=j+1;k<initArray.length;k++)
				{
					if(initArray[i]+initArray[j]+initArray[k]==sum)
					{
						count++;
					}
				}
			}
		}
		System.out.print(count);
	}
}