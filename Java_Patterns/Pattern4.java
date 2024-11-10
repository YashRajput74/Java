/*
	5 5 5 5 5
	4 4 4 4 4
	3 3 3 3 3
	2 2 2 2 2
	1 1 1 1 1
*/

class Pattern4
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}