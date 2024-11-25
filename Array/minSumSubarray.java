/*
34. How do you find the minimum sum of a subarray?
Ans.
*/

class minSumSubarray
{
	public static void main(String args[])
	{
		int arr[]={10,20,-20,-30};
		int minSum=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			int currentSum=0;
			for(int j=i;j<arr.length;j++)
			{
				currentSum+=arr[j];
				minSum=Math.min(currentSum,minSum);
			}
		}
		System.out.println(minSum);
	}
}