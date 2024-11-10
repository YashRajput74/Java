/*
	A A A A A
	B B B B
	C C C
	D D
	E
*/

class Pattern87
{
	public static void main(String args[])
	{
		char n='E';
		for(char i='A';i<=n;i++)
		{
			for(char j=n;j>=i;j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}