/*
   1   10   11
 100  101  110
 111 1000 1001
*/

class Pattern200
{
	public static void main(String args[])
	{
		int n=3;
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
					remainder=quotient%2;
					quotient/=2;
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