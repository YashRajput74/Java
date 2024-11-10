/*
5 4 3 2 1
1 5 4 3 2
1 1 5 4 3
1 1 1 5 4
1 1 1 1 5
*/

class Pattern194
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int l=n;
			for(int j=1;j<i;j++)
			{	
					System.out.print("1 ");
			}
			for(int j=n;j>=i;j--)
			{	
					System.out.print(l+" ");
					l--;
			}
			System.out.println();
		}
	}
}