/*
        S
      o f
    t E t
  h i c s
S o f t E
*/
class Pattern419
{
	public static void main(String args[])
	{
		String str="SoftEthics";
		int num=str.length();
		int n=5;
		int numero=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
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