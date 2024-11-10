/*
	0 1 0 1 0
	1 0 1 0 1
	0 1 0 1 0
	1 0 1 0 1
	0 1 0 1 0
*/

class Pattern19
{
	public static void main(String args[])
	{
		int n=5;
		int k=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print((k%2)+" ");
				k++;
			}
			System.out.println();
		}
	}
}