/*
A       E
  B   D
    C
  B   D
A       E
*/

class Pattern326
{
	public static void main(String args[])
	{
		char n='E';
		int l=1;
		for(char i='A';i<=n;i++)
		{
			for(char j='A';j<=n;j++)
			{
				if(j==i||j==(n-l+1))
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			l++;	
			System.out.println();
		}
	}
}