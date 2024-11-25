class maxSumSubarray
{
	public static void main(String args[])
	{
		int arr[]={10,-20,30,-20};
		int maxSum=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			int currentSum=0;
			for(int j=i;j<arr.length;j++)
			{
				currentSum+=arr[j];
				maxSum=Math.max(currentSum,maxSum);
			}
		}
		System.out.println(maxSum);
	}
}