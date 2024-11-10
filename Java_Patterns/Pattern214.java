/*
5 A A A A
4 4 B B B
3 3 3 C C
2 2 2 2 D
1 1 1 1 1
*/

class Pattern214
{
	public static void main(String args[])
	{
		int n=5;
		char m='A';
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(i+" ");
			}
			for(int k=1;k<i;k++)
			{
				System.out.print(m+" ");
			}
			m++;
			System.out.println();
		}
	}
}