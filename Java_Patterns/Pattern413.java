/*
S U M I T
S U M I
S U M
S U
S
*/
class Pattern413
{
	public static void main(String args[])
	{
		String n="SUMIT";
		int num=n.length();
		for(int i=num-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(n.charAt(j)+" ");
			}
			System.out.println();
		}
	}
}