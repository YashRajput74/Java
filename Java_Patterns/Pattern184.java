/*
      D
    D C
  D C B
D C B A
  D C B
    D C
      D
*/

class Pattern184
{
	public static void main(String args[])
	{
		char n='D';
		for(char i=n;i>='A';i--)
		{
			for(char j='A';j<i;j++)
			{
				System.out.print("  ");
			}
			for(char k=n;k>=i;k--)
			{
				System.out.printf(k+" ");
			}
			System.out.println();
		}
		for(char i='A';i<=n;i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print("  ");
			}
			for(char k=n;k>i;k--)
			{
				System.out.printf(k+" ");
			}
			System.out.println();
		}
	}
}