/*
46. How do you find the number of rotations in a 2D array?
Ans.
*/
import java.util.Arrays;
class numInversionTwoDArray
{
	public static void main(String args[])
	{
		int initArray[][]={
			{10,20,30},
			{40,50,60},
			{70,80,90}
		};
		int count=0;
		for(int i=0;i<initArray.length;i++)
		{
			for(int j=0;j<initArray[i].length;j++)
			{
				count++;
			}
		}
		int newArray[]=new int[count];
		count=0;
		for(int i=0;i<initArray.length;i++)
		{
			for(int j=0;j<initArray[i].length;j++)
			{
				newArray[count]=initArray[i][j];
				count++;
			}
		}
		System.out.println(Arrays.toString(newArray));
		// Arrays.sort(initArray);
		// int count=0;
		// for(int i=0;i<initArray.length;i++)
		// {
			// for(int j=0;j<initArray[i].length;j++)
			// {
				// for(int k=i;k<unsortedArray.length;k++)
				// {
					// for(int l=j;l<unsortedArray[k].length;l++)
					// {
						// count++;
						// if(unsortedArray[i][j]==initArray[i][j])
						// {
							// count--;
							// break;
						// }
					// }
				// }
			// }
		// }
		// System.out.println(count);
	}
}