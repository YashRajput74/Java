/*
   A
  BBB
 CCCCC
DDDDDDD
 EEEEE
  FFF
   G
*/
class Pattern407{
	public static void main(String args[]){
		char n='G';
		int num=1;
		for(char k='A';k<n;k++){
			num++;}
		if(n%2!=0){
			num++;}
		n='A';
		for(int i=1;i<=num/2;i++){
			for(int j=1;j<=num-1;j++){
				if(j>=(num/2)-i+1&&j<=(num/2)+i-1){
					System.out.print(n);}
				else{
					System.out.print(" ");}}
			n++;
			System.out.println();}
		for(int i=1;i<=(num/2)-1;i++){
			for(int j=1;j<=num-1;j++){
				if(j>=i+1&&j<=num-i-1){
					System.out.print(n);
				}
				else{
					System.out.print(" ");
				}
			}
			n++;
			System.out.println();
		}
	}
}