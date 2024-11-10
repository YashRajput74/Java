/*
1
2 3 2
4 5 6 5 4
7 8 9 10 9 8 7
*/

class Pattern248
{
	public static void main(String args[])
	{
		int n=4;
		int adder=1;
		int startingPoint=1;
		for(int i=1;i<=n;i++)
		{
			int refVariable=startingPoint;
			for(int j=1;j<=i;j++)
			{
					System.out.print(refVariable+" ");
					refVariable++;
			}
			refVariable-=2;
			for(int k=1;k<i;k++)
			{
				System.out.print(refVariable+" ");
				refVariable--;
			}
			startingPoint+=adder;
			adder++;
			System.out.println();
		}
	}
}