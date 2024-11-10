/*
* * * * A
* * * B B
* * C C C
* D D D D
E E E E E
*/

class Pattern227
{
	public static void main(String args[])
	{
		char n='E';
		for(char i='A';i<=n;i++)
		{
			for(char j=n;j>i;j--)
			{
				System.out.print("* ");
			}
			for(int k='A';k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}