package arrays;

import java.util.Scanner;

public class NthLargestWithoutSort {

	public static void main(String[] args) {
	  int[]a= {10,20,15,5,30,25,35};
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter the n value from 1 to "+a.length);
        int n=sc.nextInt();
        for(int i=0;i<a.length;i++) {
        	int count=0;
        	for(int j=0;j<a.length;j++) {
        		if(a[j]>a[i])
        		{
        			count++;
        		}
        	}
        if(count==n-1)	
        {
        	System.out.println(n+" largest element is "+a[i]);
        	break;
        }
        }
	}

}
