/*
3. Find the duplicate in an array

Given an array of integers, find the duplicate element.
*/
class DuplicateElement
{
	public static void main(String args[])
	{
		int arr[]={1,3,4,2,5,2,6};
		outerLoop:// this is a labelled loop it is only used when we have to break all the nested loops with one break and we can avoid using flags with this.
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					break outerLoop;
				}
			}
		}
	}
}