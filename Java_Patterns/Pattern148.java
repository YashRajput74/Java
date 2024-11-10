/*
        0
      1 0 1
    2 1 0 1 2
  3 2 1 0 1 2 3
4 3 2 1 0 1 2 3 4
*/

class Pattern148
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			int l=i;
			for(int j=n;j>(i+1);j--)
			{
				System.out.print("  ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(l+" ");
				l--;
			}
			l+=2;
			for(int m=1;m<=i;m++)
			{
				System.out.print(l+" ");
				l++;
			}
			System.out.println();
		}
	}
}