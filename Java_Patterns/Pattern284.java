/*
5 * 3 * 1
  * 4 * 2
    5 * 3
      * 4
        5
*/
class Pattern284{
	public static void main(String args[]){
		int n=5;
		int flag=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				flag=1;
			}
			else
			{
				flag=0;
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int k=n;k>=i;k--)
			{
				if(flag%2!=0)
				{
					System.out.print("* ");
					flag++;
				}
				else
				{
					System.out.print(k+" ");
					flag++;
				}
			}
			System.out.println();
		}
	}
}