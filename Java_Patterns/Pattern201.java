/*
 1  2  3  4
 5  6  7 10
11 12 13 14
15 16 17 20
*/

class Pattern201
{
	public static void main(String args[])
	{
		int n=4;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				int bag=0;
				int quotient=count;
				int remainder=0;
				int multiplier=1;
				while(quotient>0)
				{
					remainder=quotient%8;
					quotient/=8;
					bag+=remainder*multiplier;
					multiplier*=10;
				}
				System.out.printf("%5d",bag);
				count++;
			}
			System.out.println();
		}
	}
}