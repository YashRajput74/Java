/*
1 2 3 4 5 5 4 3 2 1
1 2 3 4 4 3 2 1
1 2 3 3 2 1
1 2 2 1
1 1
*/

class Pattern258
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");	
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k+" ");	
			}
			System.out.println();
		}
	}
}