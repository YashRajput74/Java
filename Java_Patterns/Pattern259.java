/*
1 2 3 4 7 8 9 10
5 6 7 4 5 6
8 9 2 3
10 1
*/
class Pattern259
{
	public static void main(String args[])
	{
		int n=4;
		int startingPoint=1;
		int endingPoint=1;
		int counter=1;
		for(int l=1;l<=n-1;l++)
		{
			endingPoint+=counter;
			counter++;
		}
		for(int i=n;i>=1;i--)
		{
			counter=-1;
			int initValue=endingPoint;
			for(int j=1;j<=i;j++)
			{
				System.out.print(startingPoint+" ");
				startingPoint++;
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(endingPoint+" ");
				endingPoint++;
				counter++;
			}
			initValue-=counter;
			endingPoint=initValue;
			System.out.println();
		}
	}
}