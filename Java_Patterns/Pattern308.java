/*
    A
   1 2
  A B C
 1 2 3 4
A B C D E
*/

class Pattern308
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			char letter='A';	
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(i%2==0)
				{
					System.out.print(k+" ");
				}
				else
				{
					System.out.print(letter+" ");
				}
				letter++;
			}
			System.out.println();
		}
	}
}