/*
	5
	44
	333
	2222
	11111
*/

class Pattern37
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=0;j<=(n-i);j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}