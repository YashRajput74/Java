/*
A

A
A B

A
A B
A B C
*/
class Pattern436
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
					System.out.print(k+" ");
				}
				System.out.println();
			}
			System.out.println();	
		}
	}
}