package arrays;

public class Example_1 {

	public static void main(String[] args) {
      int []a=new int [5];
      System.out.println("Before Entering the elements");
      for (int i=0;i<=a.length-1;i++) {
    	  System.out.println(a[i]);
      }
      System.out.println("...............");
            a[2]=12;
            a[0]=10;
            a[1]=11;
            a[3]=13;
            a[4]=14;
            System.out.println("After Entering the elements");
            for (int i=0;i<=a.length-1;i++) {
          	  System.out.println(a[i]);
            }
	}

}
