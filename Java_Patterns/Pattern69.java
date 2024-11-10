/*
	A
	B A
	C B A
	D C B A
	E D C B A
*/

class Pattern69
{
	public static void main(String args[])
	{
		char n='E';
		for(char i='A';i<=n;i++)
		{
			for(char j=i;j>='A';j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}