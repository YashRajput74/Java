/*
1
A B
1 2 3
A B C D
1 2 3 4 5
*/

class Pattern294
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			char letter='A';
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print(letter+" ");
				}
				else
				{
					System.out.print(j+" ");
				}
				letter++;
			}
			System.out.println();
		}
	}
}