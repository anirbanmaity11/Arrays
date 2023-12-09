package arrays;

import java.util.Scanner;

public class ReadDataInArray {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the Array");
	   int size=sc.nextInt();
	   String[]arr=new String[size];
	   System.out.println("Before entering the data");
	     for(int i=0;i<arr.length;i++) {
	    	 System.out.println(arr[i]);
	     }
	     System.out.println("Enter the data");
	     for(int i=arr.length-1;i>=0;i--) {
	    	 arr[i]=sc.next();
	     }
	     System.out.println("After entering the data");
	     for(int i=0;i<arr.length;i++) {
	    	 System.out.println(arr[i]);
	     }
	}
}
