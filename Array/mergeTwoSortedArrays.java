/*
4. Merge two sorted arrays
Given two sorted arrays, merge them into a single sorted array.
*/
import java.util.Arrays;
class mergeTwoSortedArrays
{
	static void mergearr(int arr1[], int arr2[], int newarr[])
	{
		int l1= arr1.length;
		int l2=arr2.length;
		int i=0;
		int j=0;
		int k=0;
		while(i<l1 && j<l2)//we are using and instead of or...
		{
			if(arr1[i]<=arr2[j])
			{
				newarr[k++]=arr1[i++]; //we are assigning the value then incrementing the value of i and k simultaneously
			}
			else
			{
				newarr[k++]=arr2[j++];
			}
		}
		while(i<l1)
            newarr[k++] = arr1[i++];//remaining elements
        while(j<l2)
            newarr[k++] = arr2[j++];
	}
	public static void main(String args[])
	{
		int arr1[]={10,20,30,40,50,60};
		int arr2[]={10,15,20,27,28,30,40,55};
		int newarr[]=new int[arr1.length+arr2.length];
		mergearr(arr1,arr2,newarr);
		System.out.println(Arrays.toString(newarr));
	}
}