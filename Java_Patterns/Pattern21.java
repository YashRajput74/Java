/*
	0 1 0 1 0
	0 0 0 0 0
	0 1 0 1 0
	0 0 0 0 0
	0 1 0 1 0
*/
class Pattern21
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=2;j<=n+1;j++)
			{
				System.out.print(((i*j)%2)+" ");
			}
			System.out.println();
		}	
	}
}