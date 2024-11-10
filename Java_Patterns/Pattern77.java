/*
	 1  2  3 4 5
	 6  7  8 9
	10 11 12
	13 14
	15
*/

class Pattern77
{
	public static void main(String args[])
	{
		int n=5;
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.printf("%3d",k);
				k++;
			}
			System.out.println();
		}
	}
}