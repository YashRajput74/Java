/*
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 4 4 4 4
  3 3 3
   2 2
    1
*/
class Pattern399
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=(2*n)-1;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((j>=(n-i+1)&&i<=n))
				{
					System.out.print(i+" ");
				}
				else if((j>=((i-n)+1)&&i>n))
				{
					System.out.print(((2*n)-i)+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}