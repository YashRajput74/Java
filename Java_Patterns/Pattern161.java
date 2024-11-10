/*
        A
      A B A
    A B C B A
  A B C D C B A
A B C D E D C B A
*/

class Pattern161
{
	public static void main(String args[])
	{
		char n='E';
		for(char i='A';i<=n;i++)
		{
			char l='A';
			for(char j=n;j>i;j--)
			{
				System.out.print("  ");
			}
			for(char k='A';k<=i;k++)
			{
				System.out.print(l+" ");
				l++;
			}
			l-=2;
			for(char k='A';k<i;k++)
			{
				System.out.print(l+" ");
				l--;
			}
			System.out.println();
		}
	}
}