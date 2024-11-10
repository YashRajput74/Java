/*
E E E E E
4 4 4 4
C C C
2 2
A
*/

class Pattern295
{
	public static void main(String args[])
	{
		int n=5;
		char letter='A';
		for(int k=1;k<n;k++)
		{
			letter++;
		}
		for(int i=n;i>=1;i--)
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
			letter--;
			System.out.println();
		}
	}
}