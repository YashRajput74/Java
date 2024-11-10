/*
	A B C D E
	F G H I J
	K L M N O
	P Q R S T
	U V W X Y
*/

class Pattern30
{
	public static void main(String args[])
	{
		int n=5;
		char k='A';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(k+" ");
				k++;
				if(k>'Z')
				{
					k='A';
				}
			}
			System.out.println();
		}
	}
}