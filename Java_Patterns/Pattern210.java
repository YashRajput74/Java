/*
0 1 2 3 4
1 0 1 2 3
2 1 0 1 2
3 2 1 0 1
4 3 2 1 0
*/

class Pattern210
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n-1;i>=0;i--)
		{
			int m=i;
			int flag=0;
			for(int j=n-1;j>=0;j--)
			{
				if(flag==1)
				{
					System.out.print(m+" ");
					m++;
				}
				else if(m==0)
				{
					System.out.print(m+" ");
					m++;
					flag=1;
				}
				else
				{
					System.out.print(m+" ");
					m--;
				}
			}
			System.out.println();
		}
	}
}