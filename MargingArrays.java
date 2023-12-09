package arrays;

import java.util.Scanner;

public class MargingArrays {

	public static void main(String[] args) {
	 int []a=toRead();
	 int []b=toRead();
	    print(a);
	    print(b);
	 int []res=new int[a.length+b.length];
	 
	 for (int i=0;i<a.length;i++) {
		 res[i]=a[i];
	   }
	 for(int i=0;i<b.length;i++) {
		 res[i+a.length]=b[i];
	   }
	 System.out.println("Elements of merged arrays are");
	 print(res);
	}
     
	 public static int[] toRead() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size of the array");
		 int n=sc.nextInt();
		 int []a=new int [n];
		 System.out.println("Enter "+n+" elements");
		 for(int i=0;i<a.length;i++) {
			 a[i]=sc.nextInt();
		 }
		 return a;
	 }
	 public static void print(int []a) 
	    {
		 for (int i=0;i<a.length;i++) {
			 System.out.println(a[i]);
		 }
	 }
}


