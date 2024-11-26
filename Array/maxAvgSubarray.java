/*
37. How do you find the maximum average of a subarray?
Ans.
*/
class maxAvgSubarray
{
	public static void main(String args[])
	{
		int arr[]={10,5,30,20,40,50,5};
		double maxAvg=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			double currentSum=0;
			double currentAvg=0;
			for(int j=i;j<arr.length;j++)
			{
				double m=j-i+1;
				currentSum+=arr[j];
				currentAvg=currentSum/m;
				maxAvg=Math.max(maxAvg,currentAvg);
			}
		}
		System.out.println(maxAvg);
	}
}
