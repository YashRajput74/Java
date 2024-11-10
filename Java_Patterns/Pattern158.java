/*
        A
      A B C
    A B C D E
  A B C D E F G
A B C D E F G H I
*/

class Pattern158
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
			for(char k='A';k<i;k++)
			{
				System.out.print(l+" ");
				l++;
			}
			System.out.println();
		}
	}
}