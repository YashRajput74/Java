/*
1
1 2
1 2 3
1 2 3 4
1 2 3
1 2
1
*/

class Pattern173
{
	public static void main(String args[])
	{
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		for(int i=n;i>1;i--)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}