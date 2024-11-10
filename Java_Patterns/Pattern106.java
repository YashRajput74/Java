/*
              1
           2  3
        4  5  6
     7  8  9 10
 11 12 13 14 15
*/

class Pattern106
{
	public static void main(String args[])
	{
		int n=5;
		int l=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print("   ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.printf("%3d",l);
				l++;
			}
			System.out.println();
		}
	}
}