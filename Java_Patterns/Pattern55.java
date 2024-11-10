/*
	 1
	 4  9
	16 25 36
	49 64 81 100
*/

class Pattern55
{
	public static void main(String args[])
	{
		int n=5;
		int k=1;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.printf("%4d",k*k);
				k++;
			}
			System.out.println();
		}
	}
}