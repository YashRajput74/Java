/*
              1
           2  3
        4     5
     6        7
  8  9 10 11 12
*/

class Pattern364
{
	public static void main(String args[])
	{
		int n=5;
		int num=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==(n-i+1)||j==n||i==n)
				{
					System.out.printf("%3d",num);
					num++;
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}