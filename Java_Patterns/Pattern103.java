/*
              1
           2  4
        3  6  9
     4  8 12 16
  5 10 15 20 25
*/

class Pattern103
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int l=i;
			for(int j=n;j>i;j--)
			{
				System.out.print("   ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.printf("%3d",l);
				l+=i;
			}
			System.out.println();
		}
	}
}