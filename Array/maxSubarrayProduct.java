/*
19. Find the maximum product subarray
*/
class maxSubarrayProduct
{
	public static void main(String args[])
	{
	int arr[]={10,20,30,0,-10,-20,30,40,-5,25};
	int prefix=1;
	int suffix=1;
	int maxproduct=1;
	int n=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			if(prefix==0)
			{
				prefix=1;
			}
			if(suffix==0)
			{
				suffix=1;
			}
			prefix*=arr[i];
			suffix*=arr[n-i];
			if(prefix>maxproduct)
			{
				maxproduct=prefix;
			}
			if(suffix>maxproduct)
			{
				maxproduct=suffix;
			}
		}
		System.out.println(maxproduct);
	}
}