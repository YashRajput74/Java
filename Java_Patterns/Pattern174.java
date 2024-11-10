/*
  1
  2  3
  4  5  6
  7  8  9 10
 10 11 12
 13 14
 15
*/

class Pattern174
{
	public static void main(String args[])
	{
		int n=4;
		int l=1;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.printf("%3d",l);
				l++;
			}
			System.out.println();
		}
		l--;
		for(int i=n;i>1;i--)
		{
			for(int k=1;k<i;k++)
			{
				System.out.printf("%3d",l);
				l++;
			}
			System.out.println();
		}
	}
}