/*
	        1
	      1 2
	    1 2 3
	  1 2 3 4
	1 2 3 4 5
*/

class Pattern97
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				int l=k;
				System.out.print(l+" ");
				l++;
			}
			System.out.println();
		}
	}
}