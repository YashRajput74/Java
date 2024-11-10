/*
	E F G H I
	D E F G
	C D E
	B C
	A
*/

class Pattern93
{
	public static void main(String args[])
	{
		char n='E';
		for(char i=n;i>='A';i--)
		{
			char k=i;
			for(char j='A';j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}