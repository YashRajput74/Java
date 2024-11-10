/*
A * * * *
A B * * *
A B C * *
A B C D *
A B C D E
*/

class Pattern224
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
			for(int k=n;k>i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}