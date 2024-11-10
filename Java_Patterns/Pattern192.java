/*
1 2 3 4 5
2 3 4 5 1
3 4 5 2 1
4 5 3 2 1
5 4 3 2 1
*/

class Pattern192
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int l=i;
			int flag=0;
			for(int j=1;j<=n;j++)
			{	
					System.out.print(l+" ");
					if(l<n&&flag==0)
					{
						l++;
					}
					else if(l==n)
					{
						l=i;
						flag=1;
						l--;
					}
					else
					{
						l--;
					}
			}
			System.out.println();
		}
	}
}