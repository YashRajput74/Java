/*
24. How do you merge two arrays in Java?
Ans.
*/
import java.util.Arrays;
class mergeArray
{
	public static void main(String args[])
	{
		int firstArray[]={10,20,30,40,50};
		int secondArray[]={10,20,30,40,50};
		int finArray[]=new int[firstArray.length+secondArray.length];
		for(int i=0;i<finArray.length;i++)
		{
			if(i<finArray.length/2)
			{
				finArray[i]=firstArray[i];
			}
			else
			{
				finArray[i]=secondArray[i-firstArray.length];
			}
		}
		System.out.print(Arrays.toString(finArray));
	}
}