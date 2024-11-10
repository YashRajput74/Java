/*
	5 10 15 20 25
	4  9 14 19 24
	3  8 13 18 23
	2  7 12 17 22
	1  6 11 16 21
*/

class Pattern14
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>0;i--)
		{
			int k=i;
			for(int j=0;j<n;j++)
			{
				System.out.printf("%3d",k);
				k+=n;
			}
			System.out.println();
		}
	}
}