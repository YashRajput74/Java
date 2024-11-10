/*
	A B C D E
	A B C D
	A B C
	A B
	A
*/

class Pattern88
{
	public static void main(String args[])
	{
		char n='E';
		for(char i=n;i>='A';i--)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}