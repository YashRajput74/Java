/*
1
3 3 3
5 5 5 5 5
3 3 3
1
*/

class Pattern175
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i+=2)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(int i=n-2;i>=1;i-=2)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}