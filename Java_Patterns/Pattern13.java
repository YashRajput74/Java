/*
	1 10 11 20 21
	2  9 12 19 22
	3  8 13 18 23
	4  7 14 17 24
	5  6 15 16 25
*/

class Pattern13
{
	public static void main(String args[])
	{	
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int k=i;
			int l=(2*n+1)-i;
			for(int j=0;j<n;j++)
			{
				if(j%2==0)
				{
					System.out.printf("%3d",k);
					k+=(2*n);
				}
				else
				{
					System.out.printf("%3d",l);
					l+=(2*n);
				}
			}
			System.out.println();
		}
	}
}