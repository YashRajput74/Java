/*
A
  B
    C
      D
    E
  F
G
*/
class Pattern384{
	public static void main(String args[]){
		int flag=0;
		char n='G';
		int num=1;
		for(char k='A';k<n;k++){
			num++;
		}
		int numero=num;
		n='A';
		if(numero%2!=0){
			numero++;
		}
		for(int i=1;i<=num;i++){
			if(i==(numero/2)){
				flag=1;
			}
			for(int j=1;j<=(numero/2);j++){
				if((j==i&&flag==0)||(j==(num-i+1)&&flag==1)){
					System.out.print(n+" ");
					n++;
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}