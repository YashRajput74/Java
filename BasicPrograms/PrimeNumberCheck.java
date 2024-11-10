class PrimeNumberCheck
{
	public static void main(String args[])
	{
		int number=37;
		int count=2;
		int flag=0;
		while(count<=number/2)
		{
			if(number%count==0){
				flag=1;
				System.out.println(number+" is not a prime number.");
				break;
			}
			count++;
		}
		if(flag==0)
		{
			System.out.println(number+" is a prime number.");
		}
	}
}