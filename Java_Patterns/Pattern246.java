/*
1
A B
2 3 4
C D E F
5 6 7 8 9
*/

class Pattern246
{
	public static void main(String args[])
	{
		int n=5;
		int num=1;
		char letter='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print(letter+" ");
					letter++;
				}
				else
				{
					System.out.print(num+" ");
					num++;
				}
			}
			System.out.println();
		}
	}
}