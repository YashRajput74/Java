/*
        A
      C C C
    E E E E E
  G G G G G G G
I I I I I I I I I
*/

class Pattern157
{
	public static void main(String args[])
	{
		char n='I';
		for(char i='A';i<=n;i+=2)
		{
			for(char j=n;j>i;j-=2)
			{
				System.out.print("  ");
			}
			for(char k='A';k<=i;k+=2)
			{
				System.out.print(i+" ");
			}
			for(char k='A';k<i;k+=2)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}