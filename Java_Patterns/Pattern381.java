/*
*
  *
    *
      *
    *
  *
*
*/
class Pattern381{
	public static void main(String args[])
	{
		int n=7;
		int flag=0;
		int num=n;
		if(num%2!=0)
		{
			num++;
		}
		for(int i=1;i<=n;i++)
		{
			if(i==(num/2))
			{
				flag=1;
			}
			for(int j=1;j<=(num/2);j++)
			{
				if((j==i&&flag==0)||(j==(n-i+1)&&flag==1))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}