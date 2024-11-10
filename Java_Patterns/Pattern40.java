/*
	2
	2 4
	2 4 6
	2 4 6 8
	2 4 6 8 10
*/

class Pattern40
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((2*j)+" ");
			}
			System.out.println();
		}
	}
}