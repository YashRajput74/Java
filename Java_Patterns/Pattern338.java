/*
o o x o o
o o x o o
x x x x x
o o x o o
o o x o o
*/

class Pattern338
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==(n/2+1)||j==(n/2)+1)
				{
					System.out.print("x ");
				}
				else
				{
					System.out.print("o ");
				}
			}
			System.out.println();
		}
	}
}