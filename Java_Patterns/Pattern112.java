/*
        A
      A B
    A B C
  A B C D
A B C D E
*/

class Pattern112
{
	public static void main(String args[])
	{
		char n='E';
		for(char i='A';i<=n;i++)
		{
			for(char j=n;j>i;j--)
			{
				System.out.print("  ");
			}
			for(char k='A';k<=i;k++)
			{
				System.out.printf(k+" ");
			}
			System.out.println();
		}
	}
}