package arrays;
import java.util.Arrays;
public class Frequency1 {

	public static void main(String[] args) {
		int []a= {10,20,10,30,40,15,10,20,30};
		Arrays.sort(a);
		int temp=0;
		for(int i=0;i<a.length;i+=temp) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			System.out.println(a[i]+" frequency is "+count);
			temp=count;
		}

	}
}
