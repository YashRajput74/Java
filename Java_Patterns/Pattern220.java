/*
* * * * 1
* * * 2 1
* * 3 2 1
* 4 3 2 1
5 4 3 2 1
*/

class Pattern220
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int m=i;
			for(int j=n;j>i;j--)
			{
				System.out.print("* ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(m+" ");
				m--;
			}
			System.out.println();
		}
	}
}