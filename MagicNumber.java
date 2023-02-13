
import java.util.*;
public class MagicNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :");
		n = sc.nextInt();
		while(n>0 || sum>9) {
			if (n==0) {
				n=sum;
				sum=0;
			}
			sum = sum+n%10;
			n=n/10;
		}
		if(sum==1) {
			System.out.println("It is a Magic number");
		}
		else {
			System.out.println("It is not a Magic number");
		}
		sc.close();
	}
	
}
