/*
* * * * A
* * * B A
* * C B A
* D C B A
E D C B A
*/

class Pattern228
{
	public static void main(String args[])
	{
		char n='E';
		for(char i='A';i<=n;i++)
		{
			char m=i;
			for(char j=n;j>i;j--)
			{
				System.out.print("* ");
			}
			for(int k='A';k<=i;k++)
			{
				System.out.print(m+" ");
				m--;
			}
			System.out.println();
		}
	}
}