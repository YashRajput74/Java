/*
D
D C
D C B
D C B A
D C B
D C
D
*/

class Pattern176
{
	public static void main(String args[])
	{
		char n='D';
		for(char i=n;i>='A';i--)
		{
			for(char k=n;k>=i;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		for(char i='A';i<n;i++)
		{
			for(char k=n;k>i;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}