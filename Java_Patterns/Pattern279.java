/*
        1
      * 1
    3 * 1
  * 3 * 1
5 * 3 * 1
*/
class Pattern279{
	public static void main(String args[]){
		int n=5;
		int flag=0;
		for(int i=1;i<=n;i++){
			int l=i;
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
					System.out.print(l+" ");
					flag++;
				}
				else
				{
					System.out.print("* ");
					flag++;
				}
				l--;
			}
			System.out.println();
		}
	}
}