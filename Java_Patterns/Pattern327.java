/*
E       E
  D   D
    C
  B   B
A       A
*/

class Pattern327
{
	public static void main(String args[])
	{
		char n='E';
		char l='A';
		for(char i=n;i>='A';i--)
		{
			for(char j=n;j>='A';j--)
			{
				if(j==i||j==l)
				{
					System.out.print(i+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			l++;	
			System.out.println();
		}
	}
}