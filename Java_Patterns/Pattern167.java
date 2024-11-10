/*
EEEEEEEEE
 DDDDDDD
  CCCCC
   BBB
    A
*/

class Pattern167
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
				System.out.print(i);
			}
			for(char l='A';l<i;l++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}