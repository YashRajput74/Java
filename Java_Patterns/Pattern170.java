/*
*
* *
* * *
* * * *
* * *
* *
*
*/

class Pattern170
{
	public static void main(String args[])
	{
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<n;i++)
		{
			for(int k=n;k>i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}