/*
	5 4 3 2 1
	5 4 3 2 1
	5 4 3 2 1
	5 4 3 2 1
	5 4 3 2 1
*/

class Pattern5
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>0;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}