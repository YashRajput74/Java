/*
  1  2  3  4  5
     5  6  7  8
        8  9 10
          10 11
             11
*/

class Pattern123
{
	public static void main(String args[])
	{
		int n=5;
		int l=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("   ");
			}
			for(int k=n;k>=i;k--)
			{
				System.out.printf("%3d",l);
				l++;
			}
			System.out.println();
			l--;
		}
	}
}