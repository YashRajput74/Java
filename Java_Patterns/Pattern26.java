/*
	A A A A A
	B B B B B
	C C C C C
	D D D D D
	E E E E E
*/
class Pattern26
{
	public static void main(String args[])
	{
		char k='E';
		for(char i='A';i<=k;i++)
		{
			for(char j='A';j<=k;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}	
	}
}