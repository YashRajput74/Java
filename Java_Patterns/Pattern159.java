/*
        A
      C B A
    E D C B A
  G F E D C B A
I H G F E D C B A
*/

class Pattern159
{
	public static void main(String args[])
	{
		char n='I';
		for(char i='A';i<=n;i+=2)
		{
			char l=i;
			for(char j=n;j>i;j-=2)
			{
				System.out.print("  ");
			}
			for(char k='A';k<=i;k+=2)
			{
				System.out.print(l+" ");
				l--;
			}
			for(char k='A';k<i;k+=2)
			{
				System.out.print(l+" ");
				l--;
			}
			System.out.println();
		}
	}
}