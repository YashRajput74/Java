/*
        5
      4 5 4
    3 4 5 4 3
  2 3 4 5 4 3 2
1 2 3 4 5 4 3 2 1
*/

class Pattern152
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
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
			l-=2;
			for(int m=n;m>i;m--)
			{
				System.out.print(l+" ");
				l--;
			}
			System.out.println();
		}
	}
}