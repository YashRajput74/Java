/*
5       1
  4   2
    3
  4   2
5       1
*/

class Pattern324
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=1;j--)
			{
				if(j==i||j==(n-i+1))
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