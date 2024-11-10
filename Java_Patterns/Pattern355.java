/*
5
5 4
5   3
5     2
5 4 3 2 1
*/

class Pattern355
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			{
				if(i==j||j==n||i==1)
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print("  ");	
				}
			}
			System.out.println();
		}
	}
}