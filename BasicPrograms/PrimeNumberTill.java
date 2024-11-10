class PrimeNumberTill
{
	public static void main(String args[])
	{
		int number=37;
		int counter=2;
		while(counter<number)
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
				System.out.println(counter+" is a prime number.");
			}
			counter++;
		}
	}
}