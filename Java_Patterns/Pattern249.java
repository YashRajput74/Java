/*
1
2 1 2
3 2 1 2 3
4 3 2 1 2 3 4
*/

class Pattern249
{
	public static void main(String args[])
	{
		int n=4;
		for(int i=1;i<=n;i++)
		{
			int refVariable=i;
			for(int j=1;j<=i;j++)
			{
					System.out.print(refVariable+" ");
					refVariable--;
			}
			refVariable+=2;
			for(int k=1;k<i;k++)
			{
				System.out.print(refVariable+" ");
				refVariable++;
			}
			System.out.println();
		}
	}
}