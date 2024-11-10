/*
E E E E E
D D D D E
C C C D E
B B C D E
A B C D E
*/

class Pattern238
{
	public static void main(String args[])
	{
		char n='E';
		char l=n;
		for(char i=n;i>='A';i--)
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