/*
      3
    2 3
  1 2 3
0 1 2 3
  1 2 3
    2 3
      3
*/
class Pattern182
{
	public static void main(String args[])
	{
		int n=4;
		for(int i=n-1;i>=0;i--)
		{
			int l=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int k=n-1;k>=i;k--)
			{
				System.out.print(l+" ");
				l++;
			}
			System.out.println();
		}
		for(int i=1;i<n;i++)
		{
			int l=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int k=n-1;k>=i;k--)
			{
				System.out.print(l+" ");
				l++;
			}
			System.out.println();
		}
	}
}