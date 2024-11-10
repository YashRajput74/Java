/*
555555555
 4444444
  33333
   222
    1
*/

class Pattern164
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=((2*i)-1);k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}