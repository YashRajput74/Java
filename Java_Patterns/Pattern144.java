/*
    5
   444
  33333
 2222222
111111111
*/

class Pattern144
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int l=n-i+1;
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=((2*i)-1);k++)
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}
}