package arrays;

public class CountPrimeNo {

	public static void main(String[] args) {
	      int[]a= {2,4,7,39,47,52};
	      int c=0;
	      for(int j=0;j<a.length;j++) {
	    	  int n=a[j];int count=0;
	    	  for(int i=2;i<=n/2;i++) {
	    		  if(n%i==0) {
	    			  count++;
	    			  break;
	    		  }
	    	  }
	    	  if (count==0)
	    		  c++;
	      }
	      System.out.println("Total count of prime number is :"+c);
	      System.out.println("helo git");
	}

}
