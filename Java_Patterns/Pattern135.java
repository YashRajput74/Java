/*
5 4 3 2 1
 4 3 2 1
  3 2 1
   2 1
    1
*/

class Pattern135
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			int l=i;
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
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