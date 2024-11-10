/*
5*****
4****
3***
2**
1*
0
*/

class Pattern317
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=0;i--)
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