/*
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5
    5
*/
class Pattern400
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=(2*n)-1;i++)
		{
			int num=1;
			int numero=i-n+1;
			for(int j=1;j<=n;j++)
			{
				if(j>=(n-i+1)&&i<=n)
				{
					System.out.print(num+" ");
					num++;
				}
				else if(j>=(i-n+1)&&i>n)
				{
					System.out.print(numero+" ");
					numero++;
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