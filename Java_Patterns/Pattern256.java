/*
5 4 3 2 1
1 2 3 4
5 4 3
1 2
5
*/

class Pattern256
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			int startingPoint=5;
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print(j+" ");	
				}
				else
				{
					
					System.out.print(startingPoint+" ");
					startingPoint--;
				}
			}
			System.out.println();
		}
	}
}