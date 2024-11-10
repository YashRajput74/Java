/*
    A
   B B
  C   C
 D     D
E       E
 D     D
  C   C
   B B
    A
*/
class Pattern394{
	public static void main(String args[]){
		char n='E';
		int number=1;
		for(char k='A';k<n;k++){
			number++;}
		int num=number-1;
		int max=(number*2)-1;
		int flag=0;
		int numero=1;
		n='A';
		for(int i=1;i<=max;i++){
			for(int j=1;j<=max;j++){
				if(j==1+num||j==max-num){
					System.out.print(n);}
				else{
					System.out.print(" ");}}
			if(num>0&&flag==0){
				num--;
				n++;}
			else{
				num++;
				n--;}
			if(num==0){
				flag=1;}
			System.out.println();}
	}
}