/*
          A
        B A
      C B A
    D C B A
  E D C B A
*/

class Pattern114
{
	public static void main(String args[])
	{
		char n='E';
		for(char i='A';i<=n;i++)
		{
			char l=i;
			for(int j=n;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int k='A';k<=i;k++)
			{
				System.out.print(l+" ");
				l--;
			}
			System.out.println();
		}
	}
}