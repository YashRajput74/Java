/*
	E D C B A
	D C B A
	C B A
	B A
	A
*/

class Pattern91
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
				k--;
			}
			System.out.println();
		}
	}
}