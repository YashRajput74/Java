/*
A

A
B B

A
B B
C C C
*/
class Pattern435
{
	public static void main(String args[])
	{
		char n='C';
		for(char i='A';i<=n;i++)
		{
			for(char j='A';j<=i;j++)
			{
				for(char k='A';k<=j;k++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
			System.out.println();	
		}
	}
}