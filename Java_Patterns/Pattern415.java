/*
S U M I T
  S U M I
    S U M
      S U
        S
*/
class Pattern415
{
	public static void main(String args[])
	{
		String n="SUMIT";
		int num=n.length();
		for(int i=num-1;i>=0;i--)
		{
			for(int j=num-i-1;j>0;j--)
			{
				System.out.print("  ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(n.charAt(k)+" ");
			}
			System.out.println();
		}
	}
}