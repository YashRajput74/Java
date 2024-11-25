/*
22. How do you delete an element from an array?
Ans.
*/
import java.util.Arrays;
class deleteInArray
{
	public static void main(String args[])
	{
		int initArray[]={10,20,30,40,50};
		int numIndex=3;
		int finArray[]=new int[initArray.length-1];
		for(int i=0;i<initArray.length;i++)
		{
			if(i<numIndex)
			{
				finArray[i]=initArray[i];
			}
			else if(i==numIndex)
			{
				continue;
			}
			else
			{
				finArray[i-1]=initArray[i];
			}
		}
		System.out.print(Arrays.toString(finArray));
	}
}