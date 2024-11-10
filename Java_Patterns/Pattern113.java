/*
        A
      B B
    C C C
  D D D D
E E E E E
*/

class Pattern113
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
				System.out.printf(i+" ");
			}
			System.out.println();
		}
	}
}