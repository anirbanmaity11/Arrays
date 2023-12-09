package arrays;


public class Merging_alternative {

	public static void main(String[] args) {
	  int []a= {10,30,50,70,90};
	  int []b= {20,40,60,80,100};
	  int []res = new int [a.length+b.length];
	     int a1=0;//hold the index of a array
	     int b1=0;// hold the index of b array
	     
	     for(int i=0;i<res.length;i++)// hold the index of res array
	     {
	    	 if(i%2==0)
	    	 {
	    		 res[i]=a[a1];
	    		 a1++;
	    	 }
	    	 else
	    	 {
	    		 res[i]=b[b1];
	    		 b1++;
	    	 }
	    	
	    	}
	 
		  for(int k=0;k<res.length;k++)
		  {
			  System.out.println(res[k]);
		  }
     }
}
