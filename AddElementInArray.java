package arrays;

import java.util.Scanner;

public class AddElementInArray {

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
	   System.out.println("Enter the element");
	   int element=sc.nextInt();
	   int []res=new int [a.length+1];
	   res[index]=element;
	   
	   for(int i=0;i<a.length;i++) {
		   if (i<index)
			   res[i]=a[i];
		   else
			   res[i+1]=a[i];
		   }
	   System.out.println("After adding the "+element+"into the index "+index);
	   for (int i=0;i<res.length;i++) {
		   System.out.println(res[i]+" ");
	   }
	   
 
	}

}
