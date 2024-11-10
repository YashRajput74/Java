/*
45. How do you find the number of rotations in an array?
Ans.
*/
import java.util.Arrays;
class numRotationArray
{
	public static void main(String args[])
	{
		int initArray[]={40,20,10,50,30};
		int unsortedArray[]=new int[initArray.length];
		for(int k=0;k<initArray.length;k++)
		{
			unsortedArray[k]=initArray[k];
		}
		Arrays.sort(initArray);
		int count=0;
		for(int i=0;i<unsortedArray.length;i++)
		{
			for(int j=i;j<initArray.length;j++)
			{
				count++;
				if(unsortedArray[i]==initArray[j])
				{
					count--;
					break;
				}
			}
		}
		System.out.println(count);
	}
}