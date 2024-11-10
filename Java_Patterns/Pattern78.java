/*
	15 14 13 12 11
	10  9  8  7
	 6  5  4
	 3  2
	 1
*/
	
class Pattern78
{
	public static void main(String args[])
	{
		int n=5;
		int k=0;
		int temp=1;
		for(int x=n;x>0;x--)
		{
			k+=temp;
			temp++;
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
		}
	}
}