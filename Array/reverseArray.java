/*
26. How do you reverse an array in Java?
Ans.
*/
import java.util.Arrays;
class reverseArray
{
	public static void main(String args[])
	{
		int initArray[]={10,20,30,40,50};
		int finArray[]=new int[initArray.length];
		for(int i=0;i<initArray.length;i++)
		{
			finArray[initArray.length-i-1]=initArray[i];
		}
		System.out.println(Arrays.toString(finArray));
	}
}