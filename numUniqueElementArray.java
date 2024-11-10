/*
30. How do you find the number of unique elements in an array?
Ans.
*/
class numUniqueElementArray
{
	public static void main(String args[])
	{
		int initArray[]={10,20,30,40,50,20,50,30,60,30};
 		for(int i=0;i<initArray.length;i++)
		{
			int flag=0;
			int count=0;
			for(int j=0;j<initArray.length;j++)
			{
				if(initArray[i]==initArray[j])
				{
					count++;
				}
				if(count>1)
				{
					flag=1;
				}
			}
			if(flag==0)
			{
			System.out.print(initArray[i]+" ");
			}
		}
	}
}