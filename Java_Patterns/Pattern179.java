/*
D
D C
D C B
D C B A
D C B
D C
D
*/

class Pattern179
{
	public static void main(String args[])
	{
		char n='D';
		char l='A';
		for(char i='A';i<=n;i++)
		{
			for(char k='A';k<=i;k++)
			{
				System.out.print(l+" ");
			}
			System.out.println();
			l++;
		}
		for(char i='A';i<n;i++)
		{
			for(char k=n;k>i;k--)
			{
				System.out.print(l+" ");
			}
			l++;
			System.out.println();
		}
	}
}