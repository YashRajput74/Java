/*
D
D C
D C B
D C B A
D C B
D C
D
*/

class Pattern178
{
	public static void main(String args[])
	{
		char n='D';
		for(char i='A';i<=n;i++)
		{
			char l='A';
			for(char k='A';k<=i;k++)
			{
				System.out.print(l+" ");
				l++;
			}
			System.out.println();
		}
		for(char i='A';i<n;i++)
		{
			char l='A';
			for(char k=n;k>i;k--)
			{
				System.out.print(l+" ");
				l++;
			}
			System.out.println();
		}
	}
}