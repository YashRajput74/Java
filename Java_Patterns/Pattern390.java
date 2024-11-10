/*
      A
    B
  C
D
  E
    F
      G
*/
class Pattern390{
	public static void main(String args[]){
		char n='G';
		int numero=1;
		for(char k='A';k<n;k++){
			numero++;
		}
		int max=(numero+1)/2;
		int flag=0;
		int num=1;
		n='A';
		for(int i=1;i<=numero;i++){
			if(i==max+1){
				flag=1;
				n--;
			}
			for(int j=1;j<=max;j++){
				if((j==(max-i+1)&&flag==0)){
					System.out.print(n+" ");
					n++;}
				else if((j==(i-max+1)&&flag==1)){
					n--;
					System.out.print(n+" ");}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}