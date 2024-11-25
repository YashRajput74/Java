import java.util.Arrays;

class rotationArray//we are doing right rotation
{
	public static void main(String args[])
	{
		int d=2;
		int arr[]={10,20,30,40,50};
		int n=arr.length;
		int[] tempArr=new int[arr.length];
		int count=0;
		for(int j=n-d;j<n;j++)
		{
			tempArr[count]=arr[j];
			count++;
		}
		for(int j=0;j<n-d;j++)
		{
			tempArr[count]=arr[j];
			count++;
		}
		System.out.println(Arrays.toString(tempArr));
	}
}