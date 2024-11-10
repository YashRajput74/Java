/*
T I M U S
T I M U S
T I M U S
T I M U S
T I M U S
*/
class Pattern411
{
	public static void main(String args[])
	{
		String n="SUMIT";
		int num=n.length();
		for(int i=num-1;i>=0;i--)
		{
			for(int j=num-1;j>=0;j--)
			{
				System.out.print(n.charAt(j)+" ");
			}
			System.out.println();
		}
	}
}