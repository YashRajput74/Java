/*
        S
      S U
    S U M
  S U M I
S U M I T
*/
class Pattern414
{
	public static void main(String args[])
	{
		String n="SUMIT";
		int num=n.length();
		for(int i=0;i<num;i++)
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