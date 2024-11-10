/*
E        E
 D      D
  C    C
   B  B
    A
*/
class Pattern380{
	public static void main(String args[]){
		char n='E';
		int num=1;
		char letter='A';
		char secondLetter=letter;
		for(char k='A';k<n;k++){
			num++;
			secondLetter+=2;
		}
		for(int i=num;i>=1;i--)
		{
			for(int j=1;j<=(num*2-1);j++)
			{
				if(j==(num-i+1))
				{
					System.out.print(letter+" ");
				}
				else if(j==(num+i-1))
				{
					System.out.print(secondLetter+" ");
					secondLetter--;
				}
				else
				{
					System.out.print(" ");
				}
			}
			letter++;
			System.out.println();
		}
	}
}