/*
	5 6 7 8 9
	4 5 6 7
	3 4 5
	2 3
	1
*/

class Pattern76
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>0;i--)
		{
			int k=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}