/*
	5 4 3 2 1
	5 4 3 2
	5 4 3
	5 4
	5
*/

class Pattern74
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}