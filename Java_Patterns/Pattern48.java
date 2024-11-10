/*
	 1
	 6  2
	10  7  3
	13 11  8 4
	15 14 12 9 5
*/

class Pattern48
{
	public static void main(String args[])
	{
		int n=5;
		int x=1;
		int y;
		int z;
		for(int i=n;i>=1;i--)
		{
			y=i;
			z=x;
			for(int j=n;j>=i;j--)
			{
				System.out.printf("%3d",z);
				z=z-y;
				y++;
			}
			x=x+i;
			System.out.println();
		}
	}
}