/*
        #
      * #
    # * #
  * # * #
# * # * #
*/
class Pattern274{
	public static void main(String args[]){
		int n=5;
		int flag=0;
		for(int i=1;i<=n;i++){			
			if(i%2==0){
				flag=1;
			}
			else{
				flag=0;
			}
			for(int j=n;j>i;j--){
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				if(flag%2==0)
				{
					System.out.print("# ");
					flag++;
				}
				else
				{
					System.out.print("* ");
					flag++;
				}
				
			}
			System.out.println();
		}
	}
}