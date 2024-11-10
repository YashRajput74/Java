/*
	5 4 3 2 1
	6 5 4 3
	7 6 5
	8 7 
	9
*/

class Pattern75
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i<=((2*n)-1);i++)
		{
			int k=i;
			for(int j=n;j>i-n;j--)
			{
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
		}
	}
}