/*
38. How do you find the minimum average of a subarray?
*/
public class MinAverageSubarray
{
    public static void main(String args[])
	{
        int arr[] = {3, 7, 90, 20, 10, 50, 40};
        findMinAverage(arr);
    }
    public static void findMinAverage(int arr[])
	{
        int n = arr.length;
        double minAverage = Double.MAX_VALUE;
        int start = 0, end = 0;
        for (int i = 0; i < n; i++)
		{
            int sum = 0;
            for (int j = i; j < n; j++)
			{
                sum += arr[j];
                double average = (double) sum / (j - i + 1);
                if (average < minAverage)
				{
                    minAverage = average;
                    start = i;
                    end = j;
                }
            }
        }
        System.out.println("Minimum Average: " + minAverage);
        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++)
		{
            System.out.print(arr[i] + " ");
        }
    }
}
