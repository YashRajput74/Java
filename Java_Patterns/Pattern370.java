/*
    1
   2 2
  3   3
 4     4
5       5
*/

class Pattern370
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
					System.out.print(i);
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