/*
5. Find the maximum sum subarray
Given an array of integers, find the maximum sum subarray.
11. Find the maximum subarray sum using Kadane's algorithm
*/
//Used kadane's algorithm in this
class maxSubarraySum {
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, -50, 60};
        int maxSum = arr[0];
        int currentSum = 0;

        for (int i=0;i<arr.length;i++)
		{
			currentSum+=i;
			if(maxSum<currentSum)
			{
				maxSum=currentSum;
			}
			if(currentSum<0)
			{
				currentSum=0;
			}
        }

        System.out.println(maxSum);
    }
}
