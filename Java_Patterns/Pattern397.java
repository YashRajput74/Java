/*
    *
   - -
  -   -
 -     -
-       -
 -     -
  -   -
   - -
    *
*/
class Pattern397{
	public static void main(String args[]){
		int n=5;
		int max=(2*n)-1;
		int flag=0;
		for(int i=1;i<=max;i++){
			if(i<=n){
				flag=0;
			}
			else{
				flag=1;
			}
			for(int j=1;j<=max;j++){
				if(j==n&&(i==1||i==max)){
					System.out.print("*");
				}
				else if((j==(n-i+1)&&flag==0)||(j==(max+n-i)&&flag==1)||(j==(n+i-1)&&flag==0)||(j==(i-n+1)&&flag==1))
				{
					System.out.print("-");
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