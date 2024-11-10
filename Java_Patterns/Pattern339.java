/*
o x o x o x
x o x o x o
o x o x o x
x o x o x o
o x o x o x
x o x o x o
*/

class Pattern339
{
	public static void main(String args[])
	{
		int n=6;
		int vertical=1;
		for(int i=1;i<=n;i++)
		{
			int horizontal=vertical;
			for(int j=1;j<=n;j++)
			{
				if(horizontal%2==0)
				{
					System.out.print("x ");
				}
				else
				{
					System.out.print("o ");
				}
				horizontal++;
			}
			vertical++;
			System.out.println();
		}
	}
}