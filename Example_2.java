package arrays;

public class Example_2 {

	public static void main(String[] args) {
	double []b=new double[6];
	System.out.println("Before entering the elements");
	for (int i=0;i<=b.length-1;i++) {
		System.out.println(b[i]);
	}
        	b[0]=20;
        	b[1]=21;
        	b[2]=22;
        	b[3]=23;
        	b[4]=24;
        	b[5]=25;
	System.out.println("After Entering the Elements Prints in reverse order");
	for (int i=b.length-1;i>=0;i--) {
		System.out.println(b[i]);
	}
  }
}
