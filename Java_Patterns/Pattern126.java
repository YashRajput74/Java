/*
A A A A A
  B B B B
    C C C
      D D
        E
*/

class Pattern126
{
	public static void main(String args[])
	{
		char n='E';
		for(char i='A';i<=n;i++)
		{
			for(char j='A';j<i;j++)
			{
				System.out.print("  ");
			}
			for(char k=n;k>=i;k--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}