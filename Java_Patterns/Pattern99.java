/*
	        5
	      4 5
	    3 4 5
	  2 3 4 5
	1 2 3 4 5
*/

class Pattern99
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int l=n-i+1;
			for(int j=n;j>i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(l+" ");
				l++;
			}
			System.out.println();
		}
	}
}