/*
E E E E E
  D D D D
    C C C
      B B
        A
*/

class Pattern124
{
	public static void main(String args[])
	{
		char n='E';
		for(char i=n;i>='A';i--)
		{
			for(char j=n;j>i;j--)
			{
				System.out.print("  ");
			}
			for(char k='A';k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}