/*
1
3 * 2
6 * 5 * 4
10 * 9 * 8 * 7
*/

class Pattern253
{
	public static void main(String args[])
	{
		int n=4;
		int startingPoint=1;
		int increment=2;
		for(int i=1;i<=n;i++)
		{
			int refVariable=startingPoint;
			for(int j=1;j<=i;j++)
			{
					System.out.print(refVariable);
					refVariable--;
					if(j!=i)
					{
						System.out.print(" * ");
					}
			}
			startingPoint+=increment;
			increment++;
			System.out.println();
		}
	}
}