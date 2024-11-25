/*
21. How do you insert an element into an array?
Ans.
*/
import java.util.Arrays;
class insertInArray
{
	public static void main(String args[])
	{
		int initArray[]={10,20,30,40,50};
		int newnum=35;
		int numIndex=3;
		int finArray[]=new int[initArray.length+1];
		for(int i=0;i<=initArray.length;i++)
		{
			if(i<numIndex)
			{
				finArray[i]=initArray[i];
			}
			else if(i==numIndex)
			{
				finArray[i]=newnum;
			}
			else
			{
				finArray[i]=initArray[i-1];
			}
		}
		System.out.print(Arrays.toString(finArray));
	}
}