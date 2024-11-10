/*
* A * B *
C * D * E
* F * G *
H * I * J
* K * L *
*/

class Pattern241
{
	public static void main(String args[])
	{
		int n=5;
		int flag=0;
		char num='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(flag==0)
				{
					flag=1;
					System.out.print("* ");
				}
				else
				{
					flag=0;
					System.out.print(num+" ");
					num++;
				}
			}
			System.out.println();
		}
	}
}