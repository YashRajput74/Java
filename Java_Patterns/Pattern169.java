/*
ABCDEFGHI
 ABCDEFG
  ABCDE
   ABC
    A
*/

class Pattern169
{
	public static void main(String args[])
	{
		char n='E';
		for(char i=n;i>='A';i--)
		{
			char p='A';
			for(char j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(char k='A';k<=i;k++)
			{
				System.out.print(p);
				p++;
			}
			for(char l='A';l<i;l++)
			{
				System.out.print(p);
				p++;
			}
			System.out.println();
		}
	}
}