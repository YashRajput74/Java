/*
	1 0 1 0 1
	1 0 1 0 1
	1 0 1 0 1
	1 0 1 0 1
	1 0 1 0 1
*/
class Pattern25
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((j%2)+" ");
			}
			System.out.println();
		}	
	}
}