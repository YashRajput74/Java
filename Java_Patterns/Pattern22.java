/*
	0 0 0 0 0
	1 1 1 1 1
	0 0 0 0 0
	1 1 1 1 1
	0 0 0 0 0
*/
class Pattern22
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print((i%2)+" ");
			}
			System.out.println();
		}	
	}
}