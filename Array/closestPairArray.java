/*
13. Find the closest pair of elements in an array
*/
class closestPairArray
{
	public static void main(String args[])
	{		
		int arr[]={5,-2,1,8,-5};
		int closest=Integer.MAX_VALUE;
		int start1=0;
		int start2=1;
		int diff;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				diff=Math.abs(arr[i]-arr[j]);
				if(diff<closest)
				{
					closest=diff;
					start1=i;
					start2=j;
				}
			}
		}
		System.out.println(arr[start1]+" "+arr[start2]);
	}
}