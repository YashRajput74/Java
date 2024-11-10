/*
A B C D E
A B C D *
A B C * *
A B * * *
A * * * *
*/

class Pattern226
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
			for(int k=n;k>i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}