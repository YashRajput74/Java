/*
A A A A A
A B B B B
A B C C C
A B C D D
A B C D E
*/

class Pattern235
{
	public static void main(String args[])
	{
		char n='E';
		for(char i='A';i<=n;i++)
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