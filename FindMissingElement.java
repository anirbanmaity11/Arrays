package arrays;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
	int []a= {3,2,1,5,7,8,10};
	Arrays.sort(a);
	for (int i=0;i<a.length;i++) {
		   System.out.print(a[i]+" ");
	   }
	System.out.println();
	System.out.println("The missing elements are");
	      int j=1;
	for(int i=0;i<a.length;i++) {
       if(a[i]!=j) {
    	    System.out.println(j);
    	    j+=2;
       }
    	    else
    	    	j++;
       }
	}
  }

