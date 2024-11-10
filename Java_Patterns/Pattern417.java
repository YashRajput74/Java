/*
s c i h
t E t f
o S s c
i h t E
*/
class Pattern417
{
	public static void main(String args[])
	{
		String str="SoftEthics";
		int num=str.length();
		int n=4;
		int numero=num-1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(numero<0)
				{
					numero=num-1;
				}
				System.out.print(str.charAt(numero)+" ");
				numero--;
			}
			System.out.println();
		}
	}
}