/*
IIIIIIIII
 GGGGGGG
  EEEEE
   CCC
    A
*/

class Pattern168
{
	public static void main(String args[])
	{
		char n='E';
		char p='A';
		for(char m='A';m<n;m++)
		{
			p+=2;
		}
		for(char i=n;i>='A';i--)
		{
			for(char j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(char k='A';k<=i;k++)
			{
				System.out.print(p);
			}
			for(char l='A';l<i;l++)
			{
				System.out.print(p);
			}
			p-=2;
			System.out.println();
		}
	}
}