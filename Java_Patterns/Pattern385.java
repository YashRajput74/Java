/*
A
  B
    C
      D
    C
  B
A
*/

class Pattern385{
	public static void main(String args[]){
		char n='D';
		int num=1;
		for(char k='A';k<'D';k++){
			num++;}
		n='A';
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				if(j==i){
					System.out.print(n+" ");
					n++;}
				else{
					System.out.print("  ");}
			}
			System.out.println();}
		n-=2;
		for(int i=1;i<num;i++){
			for(int j=(num-1);j>=1;j--){
				if(j==i){
					System.out.print(n+" ");
					n--;}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}