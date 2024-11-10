/*
1 2 3 4 5
2 2 3 4 5
3 3 3 4 5
4 4 4 4 5
5 5 5 5 5
*/

class Pattern233
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int m=i;
			for(int j=1;j<i;j++)
			{
				System.out.print(i+" ");
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print(m+" ");
				m++;
			}
			System.out.println();
		}
	}
}