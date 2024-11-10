/*
   2   3   5   7  11
  13  17  19  23  29
  31  37  41  43  47
  53  59  61  67  71
  73  79  83  89  97
*/
class Pattern199{
	public static void main(String args[]){
		int n=5;
		int number=100000;
		int counter=2;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				while(true)
				{
					int count=2;
					int flag=0;
					while(count<=counter/2)
					{
						if(counter%count==0)
						{
							flag=1;
							break;
						}
						count++;
					}
					if(flag==0)
					{
						System.out.printf("%4d",counter);
						counter++;
						break;
					}
					counter++;
				}				
			}
			System.out.println();
		}
	}
}