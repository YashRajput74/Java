/*
	E D C B A
	F E D C
	G F E
	H G
	I
*/

class Pattern92
{
	public static void main(String args[])
	{
		char n='E';
		char p=n;
		for(int l='A';l<n;l++)
		{
			p++;
		}
		for(char i=n;i<=p;i++)
		{
			char k=i;
			for(char j=p;j>=i;j--)
			{
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
		}
	}
}