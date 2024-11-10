/*
1 2 3 4 5
1 2 3 4 *
1 2 3 * *
1 2 * * *
1 * * * *
*/

class Pattern218
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			int m=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(m+" ");
				m++;
			}
			for(int k=n;k>i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}