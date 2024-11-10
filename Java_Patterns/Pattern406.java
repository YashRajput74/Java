/*
   1
  123
 12345
1234567
 12345
  123
   1
*/
class Pattern406{
	public static void main(String args[]){
		int n=4;
		for(int i=1;i<=n;i++){
			int num=1;
			for(int j=1;j<=(2*n)-1;j++){
				if(j>=(n-i+1)&&j<=n+i-1){
					System.out.print(num);
					num++;
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=n-1;i++){
			int num=1;
			for(int j=1;j<=(2*n)-1;j++){
				if(j>=i+1&&j<=(2*n)-i-1){
					System.out.print(num);
					num++;
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}