/*
1 2 3 4 5
  2 3 4 5
    3 4 5
      4 5
        5
*/

class Pattern121
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int l=i;
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print(l+" ");
				l++;
			}
			System.out.println();
		}
	}
}