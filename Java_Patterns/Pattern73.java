/*
	5 5 5 5 5
	4 4 4 4
	3 3 3
	2 2
	1
*/

class Pattern73
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}