/*
5 4 3 2 1
4 3 2 1 *
3 2 1 * *
2 1 * * *
1 * * * *
*/

class Pattern222
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			int m=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(m+" ");
				m--;
			}
			for(int k=n;k>i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}