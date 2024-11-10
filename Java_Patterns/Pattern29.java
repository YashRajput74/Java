/*
	E D C B A
	E D C B A
	E D C B A
	E D C B A
	E D C B A
*/
class Pattern29
{
	public static void main(String args[])
	{
		char n='E';
		for(char i='A';i<n;i++)
		{
			for(char j=n;j>='A';j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}	
	}
}