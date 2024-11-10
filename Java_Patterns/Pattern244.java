/*
1
2 4
1 3 5
2 4 6 8
1 3 5 7 9
*/

class Pattern244
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int odd=1;
			int even=2;
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print(even+" ");
					even+=2;
				}
				else
				{
					System.out.print(odd+" ");
					odd+=2;
				}
			}
			System.out.println();
		}
	}
}