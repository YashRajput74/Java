/*
A        A
 B      B
  C    C
   D  D
    E
*/

class Pattern378
{
	public static void main(String args[])
	{
		char n='E';
		int num=1;
		for(char k='A';k<n;k++)
		{
			num++;
		}
		n='A';
		for(int i=num;i>=1;i--)
		{
			for(int j=1;j<=(num*2-1);j++)
			{
				if(j==(num-i+1)||j==(num+i-1))
				{
					System.out.print(n+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			n++;
			System.out.println();
		}
	}
}