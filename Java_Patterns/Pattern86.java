/*
	1 0 1 0 1
	0 1 0 1
	1 0 1
	0 1
	1
*/

class Pattern86
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(((i+j)%2)+" ");
			}
			System.out.println();
		}
	}
}