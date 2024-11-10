/*
	A B C D E
	A B C D E
	A B C D E
	A B C D E
	A B C D E
*/
class Pattern27
{
	public static void main(String args[])
	{
		char n='E';
		for(char i='A';i<n;i++)
		{
			for(char j='A';j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}	
	}
}