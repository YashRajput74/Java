/*
	        1
	      2 1
	    3 2 1
	  4 3 2 1
	5 4 3 2 1
*/

class Pattern100
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int l=i;
			for(int j=n-i;j>=1;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(l+" ");
				l--;
			}
			System.out.println();
		}
	}
}