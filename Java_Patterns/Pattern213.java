/*
A B C D E
B C D E A
C D E A B
D E A B C
E A B C D
*/

class Pattern213
{
	public static void main(String args[])
	{
		char n='E';
		for(char i='A';i<=n;i++)
		{
			char m=i;
			for(char j='A';j<=n;j++)
			{
				System.out.print(m+" ");
				m++;
				if(m=='F')
				{
					m='A';
				}
			}
			System.out.println();
		}
	}
}