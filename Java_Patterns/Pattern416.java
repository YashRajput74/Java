/*
S o f t
E t h i
c s S o
f t E t
*/
class Pattern416
{
	public static void main(String args[])
	{
		String str="SoftEthics";
		int num=str.length();
		int n=4;
		int numero=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
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