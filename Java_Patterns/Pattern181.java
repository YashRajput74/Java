/*
      3
    3 2
  3 2 1
3 2 1 0
  3 2 1
    3 2
      3
*/

class Pattern181
{
	public static void main(String args[])
	{
		int n=4;
		for(int i=n-1;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int k=n-1;k>=i;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int k=n-1;k>=i;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}