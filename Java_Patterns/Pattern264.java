/*
1
* *
1 2 3
* * * *
1 2 3 4 5
*/

class Pattern264
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
}