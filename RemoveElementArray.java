package arrays;

import java.util.Scanner;

public class RemoveElementArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
			int n=sc.nextInt();
		    int []a=new int[n];
		System.out.println("Enter "+n+" elements");
		for (int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the index from 0 to "+a.length);
		   int index=sc.nextInt();
		   int []res=new int [a.length-1];
		   
		   for(int i=0;i<res.length;i++) {
			   if (i<index)
				   res[i]=a[i];
			   else
				   res[i]=a[i+1];
			   }
		   System.out.println("After removing the element" );
		   for (int i=0;i<res.length;i++) {
			   System.out.println(res[i]+" ");
		   }

	}

}
