/*
    S
   oft
  Ethic
 sSoftEt
hicsSoftE
*/
class Pattern422
{
	public static void main(String args[])
	{
		String str="SoftEthics";
		int num=str.length();
		int n=5;
		int numero=0;
		for(int i=0;i<=n-1;i++)
		{
			for(int j=i;j<n-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<(2*i)+1;k++)
			{
				if(numero==num)
				{
					numero=0;
				}
				System.out.print(str.charAt(numero));
				numero++;
			}
			System.out.println();
		}
	}
}