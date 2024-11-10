/*
    1
   2 2
  3   3
 4     4
5       5
 4     4
  3   3
   2 2
    1
*/
class Pattern392{
	public static void main(String args[]){
		int n=5;
		int num=n-1;
		int max=(n*2)-1;
		int flag=0;
		int numero=1;
		for(int i=1;i<=max;i++){
			for(int j=1;j<=max;j++){
				if(j==1+num||j==max-num){
					System.out.print(numero);}
				else{
					System.out.print(" ");}
			}
			if(num>0&&flag==0){
				num--;
				numero++;
			}
			else{
				num++;
				numero--;
			}
			if(num==0){
				flag=1;
			}
			System.out.println();
		}
	}
}