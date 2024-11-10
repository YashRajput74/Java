/*
1 2 3 4 5
A B C D
1 2 3
A B
1
*/

class Pattern298
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
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