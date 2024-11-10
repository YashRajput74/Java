/*
             15
          14 13
       12 11 10
     9  8  7  6
  5  4  3  2  1
*/

class Pattern107
{
	public static void main(String args[])
	{
		int n=5;
		int l=0;
		for(int m=1;m<=n;m++)
		{
			l+=m;
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print("   ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.printf("%3d",l);
				l--;
			}
			System.out.println();
		}
	}
}