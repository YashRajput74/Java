/*
	1 1 1 1 1
	0 0 0 0
	1 1 1
	0 0
	1
*/

class Pattern81
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print((i%2)+" ");
			}
			System.out.println();
		}
	}
}