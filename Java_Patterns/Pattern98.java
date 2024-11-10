/*
	        5
	      4 4
	    3 3 3
	  2 2 2 2
	1 1 1 1 1
*/

class Pattern98
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}