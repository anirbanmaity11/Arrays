package arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int []arr= {10,8,56,77,34};
		System.out.println("The given array is");
		System.out.println(Arrays.toString(arr));
	   int start=0;int end=arr.length-1;
	     while(start<=end) {
	    	 int temp = arr[start];
	          arr[start] = arr[end];
	            arr[end] = temp;
	            start++;end--;
	     }
	     System.out.println("The reverse array is");
		System.out.println(Arrays.toString(arr));

	}

}
