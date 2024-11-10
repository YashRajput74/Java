/*
	1
	3  5
	5  7  9
	7  9 11 13
	9 11 13 15 17
*/

class Pattern43
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=(2*n)-1;i+=2)
		{
			int k=i;
			for(int j=1;j<=i;j+=2)
			{
				System.out.printf("%3d",k);
				k+=2;
			}
			System.out.println();
		}
	}
}