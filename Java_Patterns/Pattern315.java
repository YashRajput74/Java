/*
    1
   ABC
  23456
 DEFGHIJ
789123456
*/
class Pattern315{
	public static void main(String args[]){
		int n=5;
		int num=1;
		char letter='A';
		int flag=0;
		for(int i=1;i<=n;i++){
			for(int j=n;j>i;j--){
				System.out.print(" ");}
			for(int k=1;k<=(2*i)-1;k++){
				if(i%2==0){
					System.out.print(letter);
					if(flag==1){
						letter='A';
						flag=0;}
					else{
						letter++;}
				}
				else{
					System.out.print(num);
					num++;
				}
				if(num==10){
					num=1;
				}
				if(letter=='Z'){
					flag=1;
				}
			}
			System.out.println();
		}
	}
}