/*
	          2
           4  6
        8 10 12
    14 16 18 20
 22 24 26 28 30
*/

class Pattern101
{
	public static void main(String args[])
	{
		int n=5;
		int l=2;
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