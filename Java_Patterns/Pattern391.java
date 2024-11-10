/*
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
*/

class Pattern391{
	public static void main(String args[]){
		int n=5;
		int num=n-1;
		int max=(n*2)-1;
		int flag=0;
		for(int i=1;i<=max;i++){
			for(int j=1;j<=max;j++){
				if(j==1+num||j==max-num){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			if(num>0&&flag==0){
				num--;
			}
			else{
				num++;
			}
			if(num==0){
				flag=1;
			}
			System.out.println();
		}
	}
}