//Fibonnaci Pyramid
/*
	0
	0 1
	0 1 1
	0 1 1 2
	0 1 1 2 3
*/

class Pattern58
{
	public static void main(String args[])
	{
		int k=5;
		for(int i=0;i<k;i++)
		{
			int a=0;
			int b=1;
			int temp;
			for(int j=0;j<=i;j++)
			{
				if(j==0)
				{
					System.out.print(a);
				}
				else
				{
					System.out.printf("%3d",b);
					temp=b;
					b+=a;
					a=temp;
				}
			}
			System.out.println();
		}
	}
}