/*
	1 1 2 1 3 1
	1 2 2 2 3 2
	1 3 2 3 3 3
	1 4 2 4 3 4
	1 5 2 5 3 5
*/

class Pattern10
{
	public static void main(String args[])
	{
		int r=5;
		int c=3;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				System.out.printf(j+" "+i+" ");
			}
			System.out.println();
		}
	}
}