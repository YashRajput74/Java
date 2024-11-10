/*
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7
1 2 3 4 5
1 2 3
1
*/

class Pattern257
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=(2*n-1);i>=1;i-=2)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");	
			}
			System.out.println();
		}
	}
}