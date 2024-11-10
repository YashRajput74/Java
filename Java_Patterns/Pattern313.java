/*
5 5 5 5 5
 D D D D
  3 3 3
   B B
    1
*/

class Pattern313
{
	public static void main(String args[])
	{
		int n=5;
		char letter='A';
		for(int l=1;l<n;l++)
		{
			letter++;
		}
		for(int i=n;i>=1;i--)
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
			letter--;
			System.out.println();
		}
	}
}