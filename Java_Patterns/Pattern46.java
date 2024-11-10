/*
	 2
	 4 6
	 8 10 12
	14 16 18 20
	22 24 26 28 30
*/

class Pattern46
{
	public static void main(String args[])
	{
		int n=5;
		int k=2;
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