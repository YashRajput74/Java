/*
A B C D E
 A B C D
  A B C
   A B
    A
*/

class Pattern138
{
	public static void main(String args[])
	{
		char n='E';
		for(char i=n;i>='A';i--)
		{
			for(char j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(char k='A';k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}