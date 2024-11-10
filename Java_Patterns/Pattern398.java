/*
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
*/
class Pattern398
{
	public static void main(String args[])
	{
		int n=5;
		int flag=0;
		for(int i=1;i<=(2*n)-1;i++)
		{
			if(i>n)
			{
				flag=1;
			}
			for(int j=1;j<=n;j++)
			{
				if((j>=(n-i+1)&&flag==0)||(j>=(i-n+1)&&flag==1))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}