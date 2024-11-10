/*
5 * 5 * 5
4 * 4 *
3 * 3
2 *
1
*/

class Pattern272
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
	}
}