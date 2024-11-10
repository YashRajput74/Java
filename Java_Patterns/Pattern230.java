/*
E D C B A
* D C B A
* * C B A
* * * B A
* * * * A
*/

class Pattern230
{
	public static void main(String args[])
	{
		char n='E';
		for(char i=n;i>='A';i--)
		{
			char m=i;
			for(int j=n;j>i;j--)
			{
				System.out.print("* ");
			}
			for(char k='A';k<=i;k++)
			{
				System.out.print(m+" ");
				m--;
			}
			System.out.println();
		}
	}
}