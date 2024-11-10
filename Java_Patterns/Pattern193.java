/*
1 1 1 1 1
1 1 1 1 2
1 1 1 3 3
1 1 4 4 4
1 5 5 5 5
*/

class Pattern193
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{	
					System.out.print("1 ");
			}
			for(int j=1;j<i;j++)
			{	
					System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}