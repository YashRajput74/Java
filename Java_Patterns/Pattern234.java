/*
5 5 5 5 5
4 4 4 4 5
3 3 3 4 5
2 2 3 4 5
1 2 3 4 5
*/

class Pattern234
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			int m=i+1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			for(int k=n;k>i;k--)
			{
				System.out.print(m+" ");
				m++;
			}
			System.out.println();
		}
	}
}