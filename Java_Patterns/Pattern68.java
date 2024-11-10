/*
	E
	D D
	C C C
	B B B B
	A A A A A
*/

class Pattern68
{
	public static void main(String args[])
	{
		char n='E';
		for(char i=n;i>='A';i--)
		{
			for(char j=n;j>=i;j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}