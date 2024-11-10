/*
0
4 0 4
3 4 0 4 3
2 3 4 0 4 3 2
*/

class Pattern250
{
	public static void main(String args[])
	{
		int n=4;
		int startingPoint=n+1;
		for(int i=1;i<=n;i++)
		{
			int refVariable=startingPoint;
			for(int j=1;j<=i;j++)
			{
				if(i==j)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print(refVariable+" ");
					refVariable++;
				}
			}
			refVariable--;
			for(int k=1;k<i;k++)
			{
				System.out.print(refVariable+" ");
				refVariable--;
			}
			startingPoint--;
			System.out.println();
		}
	}
}