/*
 1  2  3  4  5
10  9  8  7  6
11 12 13 14 15
20 19 18 17 16 
21 22 23 24 25
*/

class Pattern189
{
	public static void main(String args[])
	{
		int n=5;
		int m=0;
		for(int i=1;i<=n;i++)
		{
			int flag=1;
			for(int j=1;j<=n;j++)
			{
				if(i%2!=0)
				{
					System.out.printf("%3d",(m+j));
				}
				else
				{
					System.out.printf("%3d",(m-j+1));
					flag=0;
				}
			}
			if(flag==1)
			{
				m+=10;
			}
			System.out.println();
		}
	}
}