/*
	1
	2 6
	3 7 10
	4 8 11 13
	5 9 12 14 15
*/

class Pattern56
{
	public static void main(String args[])
	{
		int k=5;
		for(int i=1;i<=k;i++)
		{
			int m=i;
			int l=k-1;
			for(int j=1;j<=i;j++)
			{
				if(j==1)
				{
					System.out.print(i);
				}
				else
				{
					m+=l;
					System.out.printf("%3d",m);
					l-=1;
				}
			}
			System.out.println();
		}
	}
}


/*
logic is we see each column first number is equal to i;
then it is incremented with max value of i-1 for second value in a row;
then for third value in a row the second value is incremented by i-2 and so on.
*/