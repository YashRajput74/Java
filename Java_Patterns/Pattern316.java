/*
0
1*
2**
3***
4****
5*****
*/

class Pattern316
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j==0)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}