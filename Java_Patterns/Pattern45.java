/*
	 1
	 3  5
	 7  9 11
	13 15 17 19
	21 23 25 27 29
*/

class Pattern45
{
	public static void main(String args[])
	{
		int n=5;
		int k=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.printf("%3d",k);
				k+=2;
			}
			System.out.println();
		}
	}
}