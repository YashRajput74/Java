/*
	E E E E E
	D D D D D
	C C C C C
	B B B B B
	A A A A A
*/
class Pattern28
{
	public static void main(String args[])
	{
		char n='E';
		for(char i=n;i>='A';i--)
		{
			for(char j='A';j<=n;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}	
	}
}