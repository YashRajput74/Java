/*
    1
    2
1 2 3 2 1
    2
    1
*/
class Pattern332{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==(n/2)+1&&i<=(n/2)+1)
				{
					System.out.print(i+" ");
				}
				else if(i==(n/2)+1&&j<(n/2)+1)
				{
					System.out.print(j+" ");
				}
				else if(j==(n/2)+1)
				{
					System.out.print((n-i+1)+" ");
				}
				else if(i==(n/2)+1)
				{
					System.out.print((n-j+1)+" ");
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