import java.util.Scanner;

public class StrongNumber {

	static int fact(int n) {
		if (n==0) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r,sum=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number:");
		n = sc.nextInt();
		int temp =n;
		while(n>0) {
			r = n % 10;
			sum += fact(r); 
			n/=10;
		}
		if(sum==temp) {
			System.out.println("The nummber is Strong number");
		}
		else {
			System.out.println("The nummber is not a Strong number");
		}
		sc.close();
	}

}
