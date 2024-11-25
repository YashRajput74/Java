/*
36. How do you find the minimum product of a subarray?
Ans.
*/
class minProductSubarray
{
	public static void main(String args[])
	{
		int arr[]={10,-20,3,-40,50,0};
		int minProduct=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			int currentProduct=1;
			for(int j=i;j<arr.length;j++)
			{
				currentProduct*=arr[j];
				minProduct=Math.min(currentProduct,minProduct);
			}
		}
		System.out.println(minProduct);
	}
}