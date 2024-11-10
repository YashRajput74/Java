/*
   1
  222
 33333
4444444
 55555
  666
   7
*/
class Pattern405{
	public static void main(String args[]){
		int n=4;
		int num=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=(2*n)-1;j++){
				if(j>=(n-i+1)&&j<=n+i-1){
					System.out.print(num);
				}
				else{
					System.out.print(" ");
				}
			}
			num++;
			System.out.println();
		}
		for(int i=1;i<=n-1;i++){
			for(int j=1;j<=(2*n)-1;j++){
				if(j>=i+1&&j<=(2*n)-i-1){
					System.out.print(num);
				}
				else
				{
					System.out.print(" ");
				}
			}
			num++;
			System.out.println();
		}
	}
}