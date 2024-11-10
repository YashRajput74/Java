/*
      A
    B B
  C C C
D D D D
  E E E
    F F
      G
*/
class Pattern186{
	public static void main(String args[]){
		char n='D';
		char l='A';
		for(char i=n;i>='A';i--)
		{
			for(char j='A';j<i;j++)
			{
				System.out.print("  ");
			}
			for(char k=n;k>=i;k--)
			{
				System.out.printf(l+" ");
			}
			l++;
			System.out.println();
		}
		for(char i='B';i<=n;i++)
		{
			for(char j='A';j<i;j++)
			{
				System.out.print("  ");
			}
			for(char k=n;k>=i;k--)
			{
				System.out.printf(l+" ");
			}
			l++;
			System.out.println();
		}
	}
}