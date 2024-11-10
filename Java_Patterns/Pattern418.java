/*
S
o f
t E t
h i c s
S o f t E
*/
class Pattern418
{
	public static void main(String args[])
	{
		String str="SoftEthics";
		int num=str.length();
		int n=5;
		int numero=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
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