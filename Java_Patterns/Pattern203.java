/*
1 2 3 4 5
0 3 4 5 6
0 0 5 6 7
0 0 0 7 8
0 0 0 0 9
*/

class Pattern203
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=2*n;i+=2)
		{
			int m=i;
			for(int j=1;j<i;j+=2)
			{
				System.out.print("0 ");
			}
			for(int k=2*n;k>=i;k-=2)
			{
				System.out.print(m+" ");
				m++;
			}
			System.out.println();
		}
	}
}