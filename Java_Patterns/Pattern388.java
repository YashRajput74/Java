/*
      4
    3
  2
1
  2
    3
      4
*/

class Pattern388{
	public static void main(String args[]){
		int n=7;
		int max=(n+1)/2;
		int flag=0;
		int num=1;
		for(int i=1;i<=n;i++){
			if(i==max+1)
			{
				flag=1;
			}
			for(int j=1;j<=max;j++)
			{
				if((j==(max-i+1)&&flag==0))
				{
					System.out.print(j+" ");
				}
				else if((j==(i-max+1)&&flag==1))
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