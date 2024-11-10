/*
1
1 * 2
1 * 2 * 3
1 * 2 * 3 * 4
*/

class Pattern251
{
	public static void main(String args[])
	{
		int n=4;
		for(int i=1;i<=(2*n);i+=2)
		{
			int refVariable=1;
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(refVariable+" ");
					refVariable++;
				}
			}
			System.out.println();
		}
	}
}