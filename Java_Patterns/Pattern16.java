/*
	1 2 3 4 5
	2 3 4 5 6
	3 4 5 6 7
	4 5 6 7 8
	5 6 7 8 9
*/

class Pattern16
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int k=i;
			for(int j=0;j<n;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}