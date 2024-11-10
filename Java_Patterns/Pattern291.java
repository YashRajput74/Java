/*
A
2 2
C C C
4 4 4 4
E E E E E
*/

class Pattern291
{
	public static void main(String args[])
	{
		int n=5;
		char letter='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print(i+" ");
				}
				else
				{
					System.out.print(letter+" ");
				}
			}
			letter++;
			System.out.println();
		}
	}
}