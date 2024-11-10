/*
      A
    A B
  A B C
A B C D
  A B C
    A B
      A
*/

class Pattern187
{
	public static void main(String args[])
	{
		char n='D';
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
		for(char i=n;i>='A';i--)
		{
			for(char j=n;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(char k='A';k<i;k++)
			{
				System.out.printf(k+" ");
			}
			System.out.println();
		}
	}
}