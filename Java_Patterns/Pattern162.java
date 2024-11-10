/*
        A
      B C B
    C D E D C
  D E F G F E D
E F G H I H G F E
*/

class Pattern162
{
	public static void main(String args[])
	{
		char n='E';
		for(char i='A';i<=n;i++)
		{
			char l=i;
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