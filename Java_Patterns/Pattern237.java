/*
A B C D E
B B C D E
C C C D E
D D D D E
E E E E E
*/

class Pattern237
{
	public static void main(String args[])
	{
		char n='E';
		char l=n;
		for(char i='A';i<=n;i++)
		{
			char m=i;
			for(char j='A';j<i;j++)
			{
				System.out.print(i+" ");
			}
			for(char k=n;k>=i;k--)
			{
				System.out.print(m+" ");
				m++;
			}
			System.out.println();
		}
	}
}