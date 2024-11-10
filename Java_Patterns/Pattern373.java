/*
    E
   D D
  C   C
 B     B
A       A
*/

class Pattern373
{
	public static void main(String args[])
	{
		char m='E';
		int n=1;
		for(char k='A';k<m;k++)
		{
			n++;
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n*2-1);j++)
			{
				if(j==(n-i+1)||j==(n+i-1))
				{
					System.out.print(m);
				}
				else
				{
					System.out.print(" ");
				}
			}
			m--;
			System.out.println();
		}
	}
}