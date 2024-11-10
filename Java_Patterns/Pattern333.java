/*
    2
    1
2 1 0 1 2
    1
    2
*/
class Pattern333{
	public static void main(String args[]){
		int n=5;
		int vertical=(n/2);
		int horizontal=(n/2);
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==(n/2)+1&&i<=(n/2)+1){
					System.out.print(vertical+" ");
					vertical--;
					if(vertical==-1){
						vertical++;}
				}
				else if(i==(n/2)+1&&j<(n/2)+1){
					System.out.print(horizontal+" ");
					horizontal--;
				}
				else if(j==(n/2)+1){
					vertical++;
					System.out.print(vertical+" ");
				}
				else if(i==(n/2)+1){
					horizontal++;
					System.out.print(horizontal+" ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}