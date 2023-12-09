package arrays;

import java.util.Scanner;

public class FindLarge {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size of the array");
		 int n=sc.nextInt();
		 int [] a=new int[n];
		 System.out.println("Enter "+n+" elements");
		 for(int i=0;i<a.length;i++) {
			 a[i]=sc.nextInt();
		 }
		  int large=a[0];
		 for(int i=0;i<a.length;i++) {
			 if (a[i]>large)
			 {
				 large=a[i];
			 }
		 }
		 System.out.println("the largest element is:"+large);
	}
}
