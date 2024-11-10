/*
5 5 5 5 5
4 5 5 5 5
3 4 5 5 5 
2 3 4 5 5
1 2 3 4 5
*/

class Pattern191
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
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