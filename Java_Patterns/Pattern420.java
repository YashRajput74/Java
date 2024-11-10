/*
        T
      T I
    T I M
  T I M U
T I M U S
*/
class Pattern420
{
	public static void main(String args[])
	{
		String str="SUMIT";
		int n=str.length();
		for(int i=n-1;i>=0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print("  ");
			}
			for(int k=n-1;k>=i;k--)
			{
				System.out.print(str.charAt(k)+" ");
			}
			System.out.println();
		}
	}
}