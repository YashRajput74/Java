/*
1 2 3 4 5
2 3 4 5 1
3 4 5 1 2
4 5 1 2 3
5 1 2 3 4
*/

class Pattern204
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int m=i;
			for(int k=1;k<=n;k++)
			{
				System.out.print(m+" ");
				m++;
				if(m==(n+1))
				{
					m=1;
				}
			}
			System.out.println();
		}
	}
}