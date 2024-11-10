/*
    E
   D F
  C   G
 B     H
A       I
*/
class Pattern374{
	public static void main(String args[]){
		char m='E';
		int n=1;
		int flag=1;
		int num=0;
		for(char k='A';k<m;k++){
			n++;
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=(n*2-1);j++){
				if(j==(n-i+1)||j==(n+i-1)){
					System.out.print(m);
					if(flag==1){
						num++;
						flag=0;
						m-=num;
					}
					else{
						num++;
						flag=1;
						m+=num;
					}
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