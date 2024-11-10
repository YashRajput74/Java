/*
	 1
	 3 2
	 6 5 4
	10 9 8 7
	
*/

class Pattern44
{
	public static void main(String args[])
	{
		int n=4;
		int l=0;
		int h=0;
		for(int i=1;i<=n;i++)
		{
			l=l+i;
			h=l;
			for(int j=1;j<=i;j++)
			{
				System.out.printf("%3d",h);
				h--;
			}
			System.out.println();
		}
	}
}