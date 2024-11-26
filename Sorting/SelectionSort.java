import java.util.Arrays;
class SelectionSort
{
	public static void main(String args[])
	{
		int arr[]= {5, 2, 8, 1, 7, 4, 6, 3};
		for(int i=0;i<arr.length;i++)
		{
			int mini=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[mini])
				{
					mini=j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[mini];
			arr[mini] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}