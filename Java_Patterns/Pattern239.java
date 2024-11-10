/*
1 2 3 4 *
1 2 3 * 5
1 2 * 4 5
1 * 3 4 5
* 2 3 4 5
*/

class Pattern239
{
	public static void main(String args[])
	{
		int n=5;
		int m=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==m)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(j+" ");
				}
			}
			m--;
			System.out.println();
		}
	}
}