/*
E D C B A
 D C B A
  C B A
   B A
    A
*/

class Pattern137
{
	public static void main(String args[])
	{
		char n='E';
		for(char i=n;i>='A';i--)
		{
			char l=i;
			for(char j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(char k='A';k<=i;k++)
			{
				System.out.print(l+" ");
				l--;
			}
			System.out.println();
		}
	}
}