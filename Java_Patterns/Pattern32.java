/*
	A F K P U
	B G L Q V
	C H M R W
	D I N S X
	E J O T Y
*/

class Pattern32
{
	public static void main(String args[])
	{
		char n='E';
		int m=0;
		for(char l='A';l<=n;l++)
		{
			m++;
		}
		for(char i='A';i<=n;i++)
		{
			char k=i;
			for(char j='A';j<=n;j++)
			{
				System.out.print(k+" ");
				k+=m;
			}
			System.out.println();
		}
	}
}