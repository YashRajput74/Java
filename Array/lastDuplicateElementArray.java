/*
29. How do you find the last duplicate element in an array?
Ans.
*/
class lastDuplicateElementArray
{
	public static void main(String args[])
	{
		int initArray[]={10,20,30,40,50,20,50,30,60,30};
		int num=0;
		int flag=0;
 		for(int i=initArray.length-1;i>0;i--)
		{
			int count=0;
			for(int j=initArray.length-1;j>0;j--)
			{
				if(initArray[i]==initArray[j])
				{
					count++;
				}
				if(count>1)
				{
					num=initArray[i];
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				break;
			}
		}
		System.out.print(num);
	}
}