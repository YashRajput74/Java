/*
o x x x x
x o x x x
x x o x x
x x x o x
x x x x o
*/

class Pattern335
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i<=j)
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