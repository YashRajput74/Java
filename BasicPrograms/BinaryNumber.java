//Binary Numbers

class BinaryNumber
{
	public static void main(String args[])
	{
		int n=25;
		int bag=0;
		int quotient=n;
		int remainder=0;
		int multiplier=1;
		while(quotient>0)
		{
			remainder=quotient%2;
			quotient/=2;
			bag+=remainder*multiplier;
			multiplier*=10;
		}
		System.out.println(bag);
	}
}