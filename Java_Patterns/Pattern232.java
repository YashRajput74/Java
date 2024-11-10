/*
1 2 3 4 5
1 2 3 4 4
1 2 3 3 3
1 2 2 2 2
1 1 1 1 1
*/

class Pattern232
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int m=1;
			for(int j=n;j>=i;j--)
			{
				System.out.print(m+" ");
				m++;
			}
			for(int k=1;k<i;k++)
			{
				System.out.print((n-i+1)+" ");
			}
			System.out.println();
		}
	}
}