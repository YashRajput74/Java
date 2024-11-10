/*
    5
    4
5 4 3 2 1
    2
    1
*/

class Pattern331
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=1;j--)
			{
				if(j==(n/2)+1)
				{
					System.out.print(i+" ");
				}
				else if(i==(n/2)+1)
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