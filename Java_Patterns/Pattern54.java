/*
	1
	1 2
	2 3 4
	4 5 6  7
	7 8 9 10 11
*/

class Pattern54
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
				if(i==j)
				{
				}
				else
				{
					k++;
				}
			}
			System.out.println();
		}
	}
}