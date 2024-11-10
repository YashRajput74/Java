/*
1
  2
    3
      4
    3
  2
1
*/
class Pattern383{
	public static void main(String args[]){
		int n=7;
		for(int i=1;i<=((n+1)/2);i++){
			for(int j=1;j<=i;j++){
				if(j==i){
					System.out.print(j+" ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=(n/2);i++)
		{
			for(int j=1;j<=(n/2);j++)
			{
				if(j==((n/2)-i+1))
				{
					System.out.print(j+" ");
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