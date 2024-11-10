/*
x x x x x
x x x x x
x x o x x
x x x x x
x x x x x
*/

class Pattern337
{
	public static void main(String args[])
	{
		int n=5;
		int l=n;
		if((n%2)!=0)
		{
			l++;
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==j&&i==(l/2))
				{
					System.out.print("o ");
				}
				else
				{
					System.out.print("x ");
				}
			}
			System.out.println();
		}
	}
}