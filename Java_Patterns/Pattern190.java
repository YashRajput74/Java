/*
1 2 3 4 5
2 3 4 5 5
3 4 5 5 5 
4 5 5 5 5
5 5 5 5 5
*/

class Pattern190
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int l=i;
			for(int j=1;j<=n;j++)
			{	
					System.out.print(l+" ");
					if(l<n)
					{
						l++;
					}
			}
			System.out.println();
		}
	}
}