/*
x o o o x
o x o x o
o o x o o
o x o x o
x o o o x
*/

class Pattern336
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==j||j==(n-i+1))
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