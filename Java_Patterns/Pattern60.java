/*
	0
	1 1
	0 0 0
	1 1 1 1
	0 0 0 0 0
	1 1 1 1 1 1
*/

class Pattern60
{
	public static void main(String args[])
	{
		int n=6;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
	}
}