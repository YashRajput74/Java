/*
A B C D E
A B C D D
A B C C C
A B B B B
A A A A A
*/

class Pattern236
{
	public static void main(String args[])
	{
		char n='E';
		for(char i=n;i>='A';i--)
		{
			char m='A';
			for(char j='A';j<=i;j++)
			{
				System.out.print(m+" ");
				m++;
			}
			for(char k=n;k>i;k--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}