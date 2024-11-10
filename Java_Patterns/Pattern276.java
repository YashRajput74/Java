/*
        1
      * *
    3 2 1
  * * * *
5 4 3 2 1
*/

class Pattern276
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int l=i;
			for(int j=n;j>i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				if(i%2==0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(l+" ");
					l--;
				}
			}
			System.out.println();
		}
	}
}