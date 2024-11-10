/*
	5 9 12 14 15
	4 8 11 13
	3 7 10
	2 6
	1
*/

class Pattern80
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>0;i--)
		{
			int l=n-1;
			int m=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(m+" ");
				m+=l;
				l--;
			}
			System.out.println();
		}
	}
}