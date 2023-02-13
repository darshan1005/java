import java.util.Scanner;

public class harshadNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n,sum=0,x=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number:");
		n=sc.nextInt();
		n1 = n;
		while(n>0) {
			if(n1==0){
				n1=x;
				x=0;
			}
			sum = sum+n%10;
			n=n/10;
		}
		if(n1%sum==0) {
			System.out.println("It is a hrshad number");
		}
		else if(x==0){
			System.out.println("It is an error/exception");
		}
		else {
			System.out.println("It is a not hrshad number");
		}
		sc.close();
	}

}
