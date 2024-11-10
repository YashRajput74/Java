/*
        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
*/

class Pattern153
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int l=i;
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