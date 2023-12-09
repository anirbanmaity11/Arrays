package arrays;

import java.util.Scanner;

public class AveragePrice {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of products");
      int n=sc.nextInt();
      double[]price=new double[n];
      System.out.println("Enter"+n+" prices");double sum=0;
      for(int i=0;i<price.length;i++) {
    	  price[i]=sc.nextDouble();
    	  sum=sum+price[i];
      }
      double avg=sum/n;
      System.out.println("The average price is : "+avg);

	}

}
