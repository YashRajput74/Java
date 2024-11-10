/*
	          1
           3  5
        7  9 11
    13 15 17 19
 21 23 25 27 29
*/

class Pattern102
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
				l+=2;
			}
			System.out.println();
		}
	}
}