package arrays;

import java.util.Scanner;

public class NthSmallestWithOutSort {

   public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	 int []a= {10,5,12,15,20,11};
	System.out.println("Enter the index from 1 to "+a.length);
		int n=sc.nextInt();
		 for(int i=0;i<a.length;i++) {
			 int count=0;
			 for(int j=0;j<a.length;j++) {
			    if(a[i]>a[j])
				  count++;
			   }
			  if(count==n-1) {
			 System.out.println(n+" smallest element is "+a[i]);
			   }
				   
		   }
	}

}
