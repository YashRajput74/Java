/*
      D
    C D
  B C D
A B C D
  B C D
    C D
      D
*/
class Pattern185
{
	public static void main(String args[]){
		char n='D';
		for(char i=n;i>='A';i--){
			char l=i;
			for(char j='A';j<i;j++){
				System.out.print("  ");
			}
			for(char k=n;k>=i;k--)
			{
				System.out.printf(l+" ");
				l++;
			}
			System.out.println();
		}
		for(char i='B';i<=n;i++)
		{
			char l=i;
			for(char j='A';j<i;j++)
			{
				System.out.print("  ");
			}
			for(char k=n;k>=i;k--)
			{
				System.out.printf(l+" ");
				l++;
			}
			System.out.println();
		}
	}
}