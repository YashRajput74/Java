/*
5        5
 4      4
  3    3
   2  2
    1
*/

class Pattern377
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=(n*2-1);j++)
			{
				if(j==(n-i+1)||j==(n+i-1))
				{
					System.out.print(i+" ");
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