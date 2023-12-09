package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  int []a= {10,15,20,25,30,35,40,45,50,55,60,65};
	  Arrays.sort(a);
      System.out.println("Enter the key element");
      int key=sc.nextInt();
      int low=0;int count=0;
      int high =a.length-1;
      while(low<=high)
      {
    	  int mid=(low+high)/2;
    	  if(key==a[mid])
    	  {
    		count++;
    		break;
    	  }
    	  else if(key>a[mid]) {
    		  low=mid+1;
    	  }
    	  else {
    		  high=mid-1;
    	  }
      }
      if(count==1)
    	 System.out.println("Key element is present");
      else
    	  System.out.println("Key element is not present");
	}

}
