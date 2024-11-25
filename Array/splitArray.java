/*
25. How do you split an array into two halves in Java?
Ans.
*/
import java.util.Arrays;
class splitArray
{
	public static void main(String args[])
	{
		int initArray[]={10,20,30,40,50};
		int firstArray[]=new int[initArray.length/2];
		int secondArray[]=new int[initArray.length-firstArray.length];
		for(int i=0;i<initArray.length;i++)
		{
			if(i<initArray.length/2)
			{
				firstArray[i]=initArray[i];
			}
			else
			{
				secondArray[i-firstArray.length]=initArray[i];
			}
		}
		System.out.println("First half: "+Arrays.toString(firstArray));
		System.out.println("Second half: "+Arrays.toString(secondArray));
	}
}