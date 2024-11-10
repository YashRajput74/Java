/*
S
S U
S U M
S U M I
S U M I T
*/
class Pattern412
{
	public static void main(String args[])
	{
		String n="SUMIT";
		int num=n.length();
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(n.charAt(j)+" ");
			}
			System.out.println();
		}
	}
}