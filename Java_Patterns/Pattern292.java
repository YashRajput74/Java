/*
A
1 2
A B C
1 2 3 4
A B C D E
*/

class Pattern292
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
					System.out.print(j+" ");
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