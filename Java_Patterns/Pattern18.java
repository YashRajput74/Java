/*
	1 0 1 0 1
	0 1 0 1 0
	1 0 1 0 1
	0 1 0 1 0
	1 0 1 0 1
*/

class Pattern18
{
	public static void main(String args[])
	{	
		int n=5;
		int k=1;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((k%2)+" ");
				k++;
			}
			System.out.println();
		}
	}
}