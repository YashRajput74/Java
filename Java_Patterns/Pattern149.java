/*
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
*/

class Pattern149
{
	public static void main(String args[])
	{
		int n=4;
		for(int i=1;i<=n;i++)
		{
			int l=1;
			for(int j=n;j>i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(l+" ");
				l++;
			}
			l-=2;
			for(int m=1;m<i;m++)
			{
				System.out.print(l+" ");
				l--;
			}
			System.out.println();
		}
	}
}