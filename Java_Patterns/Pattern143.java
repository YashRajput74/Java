/*
    1
   321
  54321
 7654321
987654321
*/

class Pattern143
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int l=(2*i)-1;
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=((2*i)-1);k++)
			{
				System.out.print(l);
				l--;
			}
			System.out.println();
		}
	}
}