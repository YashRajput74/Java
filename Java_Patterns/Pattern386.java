/*
      *
    *
  *
*
  *
    *
      *
*/

class Pattern386
{
	public static void main(String args[])
	{
		int n=7;
		int max=(n+1)/2;
		int flag=0;
		for(int i=1;i<=n;i++)
		{
			if(i==max+1)
			{
				flag=1;
			}
			for(int j=1;j<=max;j++)
			{
				if((j==(max-i+1)&&flag==0)||(j==(i-max+1)&&flag==1))
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