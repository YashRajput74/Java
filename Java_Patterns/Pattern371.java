/*
    5
   4 4
  3   3
 2     2
1       1
*/

class Pattern371
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n*2-1);j++)
			{
				if(j==(n-i+1)||j==(n+i-1))
				{
					System.out.print(n-i+1);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}