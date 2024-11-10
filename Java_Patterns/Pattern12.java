/*
	1  6 11 16 21
	2  7 12 17 22
	3  8 13 18 23
	4  9 14 19 24
	5 10 15 20 25
*/

class Pattern12
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
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