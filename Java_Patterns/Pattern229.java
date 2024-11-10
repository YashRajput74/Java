/*
E E E E E
* D D D D
* * C C C
* * * B B
* * * * A
*/

class Pattern229
{
	public static void main(String args[])
	{
		char n='E';
		for(char i=n;i>='A';i--)
		{
			for(int k=n;k>i;k--)
			{
				System.out.print("* ");
			}
			for(char j='A';j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}