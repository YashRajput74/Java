/*
999999999
 7777777
  55555
   333
    1
*/

class Pattern165
{
	public static void main(String args[])
	{
		int n=5;
		int l=(2*n)-1;
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=((2*i)-1);k++)
			{
				System.out.print(l);
			}
			System.out.println();
			l-=2;
		}
	}
}