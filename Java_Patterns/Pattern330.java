/*
    1
    2
1 2 3 4 5
    4
    5
*/

class Pattern330
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==(n/2)+1)
				{
					System.out.print(i+" ");
				}
				else if(i==(n/2)+1)
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}