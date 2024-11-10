/*
	A B C D E
	B C D E F
	C D E F G
	D E F G H
	E F G H I
*/

class Pattern31
{
	public static void main(String args[])
	{
		char n='E';
		for(char i='A';i<=n;i++)
		{
			char k=i;
			for(char j='A';j<=n;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}