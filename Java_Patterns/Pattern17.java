/*
	1  3  5  7  9
	3  5  7  9 11
	5  7  9 11 13
	7  9 11 13 15
	9 11 13 15 17
*/

class Pattern17
{
	public static void main(String args[])
	{
		int n=5;
		int k=1;
		for(int i=0;i<n;i++)
		{
			int l=k;
			for(int j=0;j<n;j++)
			{
				System.out.printf("%3d",l);
				l+=2;
			}
			System.out.println();
			k+=2;
		}
	}
}