/*
1
2 1
1 2 3
4 3 2 1
1 2 3 4 5
*/

class Pattern245
{
	public static void main(String args[])
	{
		int n=5;
		int evenref=0;
		for(int i=1;i<=n;i++)
		{
			int flag=0;
			int even=evenref;
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print(even+" ");
					even--;
					flag=0;
				}
				else
				{
					System.out.print(j+" ");
					flag=1;
				}
			}
			if(flag==1)
			{
				evenref+=2;
			}
			System.out.println();
		}
	}
}