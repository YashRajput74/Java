/*
 *  1 *  2 *
 3 *  4 *  5
 *  6 *  7 *
 8 *  9 * 10
 * 11 * 12 *
*/

class Pattern240
{
	public static void main(String args[])
	{
		int n=5;
		int flag=0;
		int num=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(flag==0)
				{
					flag=1;
					System.out.print(" * ");
				}
				else
				{
					flag=0;
					System.out.printf("%2d",num);
					num++;
				}
			}
			System.out.println();
		}
	}
}