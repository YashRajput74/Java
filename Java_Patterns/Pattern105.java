/*
                   1
               4   9
          16  25  36
      49  64  81 100
 121 144 169 196 225
*/

class Pattern105
{
	public static void main(String args[])
	{
		int n=5;
		int l=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print("    ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.printf("%4d",l*l);
				l++;
			}
			System.out.println();
		}
	}
}