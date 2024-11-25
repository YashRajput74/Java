/*
17. How do you find the average of elements in an array?
Ans. To find the average of elements in an array in Java, you can follow these steps:
	-Calculate the sum of the elements in the array.
	-Divide the sum by the number of elements in the array to get the average.
*/
class AverageOfArray
{
	public static void main(String args[])
	{
		int n[]={10,20,30,40,50};
		int sum=0;
		for(int i=0;i<n.length;i++)
		{
			sum+=n[i];
		}
		int average=sum/n.length;
		System.out.println(average);
	}
}