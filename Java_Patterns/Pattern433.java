/*
1

1
1 2

1
1 2
1 2 3
*/
class Pattern433
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
					System.out.print(k+" ");
				}
				System.out.println();
			}
			System.out.println();	
		}
	}
}