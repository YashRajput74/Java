/*
5 5 5 5 5
D D D D
3 3 3
B B
1
*/

class Pattern297
{
	public static void main(String args[])
	{
		int n=5;
		char letter='A';
		for(int k=1;k<n;k++)
		{
			letter++;
		}
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
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