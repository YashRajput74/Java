/*
35. How do you find the maximum product of a subarray?
Ans.
*/
class maxProductSubarray
{
	public static void main(String args[])
	{
		int arr[]={20,-1,0,50,40,-3,-50,-30};
		int maxProduct=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			int currentProduct=1;
			for(int j=i;j<arr.length;j++)
			{
				currentProduct*=arr[j];
				maxProduct=Math.max(maxProduct,currentProduct);
			}
		}
		System.out.println(maxProduct);
	}
}