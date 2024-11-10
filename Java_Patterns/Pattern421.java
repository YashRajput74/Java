/*
S o f t E
  t h i c
    s S o
      f t
        E
*/
class Pattern421
{
	public static void main(String args[])
	{
		String str="SoftEthics";
		int num=str.length();
		int n=5;
		int numero=0;
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int k=n-1;k>=i;k--)
			{
				if(numero==num)
				{
					numero=0;
				}
				System.out.print(str.charAt(numero)+" ");
				numero++;
			}
			System.out.println();
		}
	}
}