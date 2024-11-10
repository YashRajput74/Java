/*
A * * * *
B B * * *
C C C * *
D D D D *
E E E E E
*/

class Pattern223
{
	public static void main(String args[])
	{
		char n='E';
		for(char i='A';i<=n;i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(i+" ");
			}
			for(int k=n;k>i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}