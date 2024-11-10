/*
1 3 5 7 9
3 5 7 9 1
5 7 9 1 3
7 9 1 3 5
9 1 3 5 7
*/

class Pattern196
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=(2*n-1);i+=2)
		{			
			int l=i;
			int flag=0;
			for(int j=1;j<=n;j++)
			{
				if(l<(2*n))
				{
					System.out.print(l+" ");
				}
				else if(flag==0||l>=(2*n))
				{
					l=1;
					System.out.print(l+" ");
					flag=1;
				}
				l+=2;
			}
			System.out.println();
		}
	}
}