/*
32. How do you find the number of triplets in an array?
Ans.
*/
class numTripletsArray
{
	public static void main(String args[])
	{
		int initArray[]={10,20,30,40,50,20,50,30,60,30};
		int num=0;
 		for(int i=0;i<initArray.length;i++)
		{
			int count=0;
			for(int j=0;j<initArray.length;j++)
			{
				if(initArray[i]==initArray[j])
				{
					count++;
				}
				
			}
			if(count==3)
			{
				num++;
			}
		}
		System.out.print(num/3);
	}
}