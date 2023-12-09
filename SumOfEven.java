package arrays;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the size of the array");
	 int n=sc.nextInt();
	 int [] a=new int[n];
	 System.out.println("Enter "+n+" 3elements");
	 for(int i=0;i<a.length;i++) {
		 a[i]=sc.nextInt();
	 }
	 int sum=0;
	 for(int i=0;i<a.length;i++) {
	  if(a[i]%2==0)
		  sum=sum+a[i];
	 }
     System.out.println("The sum of even elements is:"+sum);
 }
}
	
