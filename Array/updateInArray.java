/*
23. How do you update an element in an array?
Ans.
*/
import java.util.Arrays;
class updateInArray
{
	public static void main(String args[])
	{
		int initArray[]={10,20,30,40,50};
		int newnum=25;
		int numIndex=3;
		int finArray[]=new int[initArray.length];
		for(int i=0;i<initArray.length;i++)
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
				finArray[i]=initArray[i];
			}
		}
		System.out.print(Arrays.toString(finArray));
	}
}