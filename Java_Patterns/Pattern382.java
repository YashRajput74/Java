/*
1
  2
    3
      4
    5
  6
7
*/
class Pattern382{
	public static void main(String args[]){
		int n=7;
		int flag=0;
		int num=n;
		int k=1;
		if(num%2!=0){
			num++;
		}
		for(int i=1;i<=n;i++)
		{
			if(i==(num/2))
			{
				flag=1;
			}
			for(int j=1;j<=(num/2);j++)
			{
				if((j==i&&flag==0)||(j==(n-i+1)&&flag==1))
				{
					System.out.print(k+" ");
					k++;
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