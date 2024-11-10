/*
	0 1 0 1 0
	0 1 0 1
	0 1 0
	0 1
	0
*/

class Pattern84
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=0;i<5;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print((j%2)+" ");
			}
			System.out.println();
		}
	}
}