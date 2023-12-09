package arrays;

public class Frequency {

	public static void main(String[] args) {
	  int []a= {10,20,30,20,10,50,25};
	  boolean[] b=new boolean[a.length];
	  for (int i=0;i<a.length;i++) {
		  if(b[i]==false) {
			  int count =1;
			  for(int j=i+1;j<a.length;j++) {
				  if(a[i]==a[j]) {
					  count++;
					  b[j]=true;
				  }
			  }
		  System.out.println(a[i]+"frequency is"+count);
		  }
		}
	}
}
