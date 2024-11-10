//Fibonacci Series
/*
	 1
	 1   2
	 3   5   8
	13  21  34  55
	89 144 233 377 610
*/

class Pattern57
{
	public static void main(String args[])
	{
		int n=5;
		int a=0;
		int b=1;
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.printf("%4d",b);
				temp=b;
				b+=a;
				a=temp;
			}
			System.out.println();
		}
	}
}

/*
	The logic is the next value is the sum of last two,
	so we have to store the last two values.
*/