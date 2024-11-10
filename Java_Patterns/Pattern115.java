/*
        E
      D E
    C D E
  B C D E
A B C D E
*/

class Pattern115
{
	public static void main(String args[])
	{
		char n='E';
		for(char i=n;i>='A';i--)
		{
			char m=i;
			for(int j='A';j<i;j++)
			{
				System.out.print("  ");
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print(m+" ");
				m++;
			}
			System.out.println();
		}
	}
}