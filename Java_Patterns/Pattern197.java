/*
1 2 3 4 5
6 7 8 1 2
3 4 5 6 7
8 1 2 3 4
5 6 7 8 1
*/

class Pattern197
{
	public static void main(String args[])
	{
		int n=5;
		int l=1;
		for(int i=1;i<=n;i++)
		{			
			for(int j=1;j<=n;j++)
			{
				System.out.print(l+" ");
				l++;
				if(l==9)
				{
					l=1;
				}
			}
			System.out.println();
		}
	}
}