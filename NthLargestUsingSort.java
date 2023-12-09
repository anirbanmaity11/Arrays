package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NthLargestUsingSort {

	public static void main(String[] args) {
	 int []a= {10,20,15,5,30,25,35};
     Arrays.sort(a);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the n value from 1 to :"+a.length);
	int n=sc.nextInt();
	System.out.println(a[a.length-n]);
	}
	

}
