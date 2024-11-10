/*
A

B
B B

C
C C
C C C
*/
class Pattern434
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
					System.out.print(i+" ");
				}
				System.out.println();
			}
			System.out.println();	
		}
	}
}