/*
27. How do you find the number of occurrences of an element in an array?
Ans.
*/
class timesElementOccuredArray
{
	public static void main(String args[])
	{
		int initArray[]={10,20,30,40,50,30,60,30};
		int num=30;
		int count=0;
		for(int i=0;i<initArray.length;i++)
		{
			if(initArray[i]==num)
			{
				count++;
			}
		}
		System.out.print("no. of times "+num+" occured "+count);
	}
}