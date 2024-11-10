/*
A B C D E E D C B A
A B C D D C B A
A B C C B A
A B B A
A A
*/

class Pattern260
{
	public static void main(String args[])
	{
		char n='E';
		for(char i=n;i>='A';i--)
		{
			char startingPoint='A';
			for(char j='A';j<=i;j++)
			{
				System.out.print(startingPoint+" ");
				startingPoint++;
			}
			startingPoint--;
			for(char k=i;k>='A';k--)
			{
				System.out.print(startingPoint+" ");
				startingPoint--;
			}
			System.out.println();
		}
	}
}