/*
	1 0 1 0 1
	1 0 1 0
	1 0 1
	1 0
	1
*/

class Pattern83
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print((j%2)+" ");
			}
			System.out.println();
		}
	}
}