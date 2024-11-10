/*
A
B B
C C C
A
B B
C C C
A
B B
C C C
*/
class Pattern428
{
	public static void main(String args[])
	{
		char n='C';
		for(char i='A';i<=n;i++)
		{
			for(char j='A';j<=n;j++)
			{
				for(char k='A';k<=j;k++)
					System.out.print(j+" ");
				System.out.println();
			}
		}
	}
}