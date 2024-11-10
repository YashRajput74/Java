/*
    S
    U
S U M I T
    I
    T
*/
class Pattern424
{
	public static void main(String args[])
	{
		String str="SUMIT";
		int num=str.length();
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				if(i==num/2)
				{
					System.out.print(str.charAt(j)+" ");
				}
				
				else if(j==num/2)
				{
					System.out.print(str.charAt(i)+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}