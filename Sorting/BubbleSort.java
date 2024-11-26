import java.util.Arrays;
class BubbleSort
{
	public static void main(String args[])
	{
		int arr[]= {5, 2, 8, 1, 7, 4, 6, 3};
		for(int j=0;j<arr.length;j++)
		{
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i]<arr[i-1])
				{
					int temp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
