/*
        E
      D D
    C C C
  B B B B
A A A A A
*/

class Pattern116
{
	public static void main(String args[])
	{
		char n='E';
		for(char i=n;i>='A';i--)
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