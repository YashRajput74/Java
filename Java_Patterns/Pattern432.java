/*
1

1
2 2

1
2 2
3 3 3
*/
class Pattern432
{
	public static void main(String args[])
	{
		int n=3;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				for(int k=1;k<=j;k++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
			System.out.println();	
		}
	}
}