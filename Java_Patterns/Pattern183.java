/*
           1
        2  3
     4  5  6
  7  8  9 10
    11 12 13
       14 15
          16
*/
class Pattern183
{
	public static void main(String args[])
	{
		int n=4;
		int l=1;
		for(int i=n-1;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("   ");
			}
			for(int k=n-1;k>=i;k--)
			{
				System.out.printf("%3d",l);
				l++;
			}
			System.out.println();
		}
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("   ");
			}
			for(int k=n-1;k>=i;k--)
			{
				System.out.printf("%3d",l);
				l++;
			}
			System.out.println();
		}
	}
}