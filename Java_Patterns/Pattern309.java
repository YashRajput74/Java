/*
    1
   B B
  3 3 3
 D D D D
5 5 5 5 5
*/

class Pattern309
{
	public static void main(String args[])
	{
		int n=5;
		char letter='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(i%2==0)
				{
					System.out.print(letter+" ");
				}
				else
				{
					System.out.print(i+" ");
				}
			}
			letter++;	
			System.out.println();
		}
	}
}