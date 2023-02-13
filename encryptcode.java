import java.util.Scanner;

public class encryptcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r,count=0,i,sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number:");
		while(true) {
			n = sc.nextInt();
			if(n>0) {
				sum=0;
				while(n!=0) {
					 r=n%10;
					 i=1;
					 count =0;
					while(i<=r) {
						if(r%i==0) {
							count++;
						}
						i++;
					}
						if (count==2) {
							sum = sum+r;
						}
						n = n/10;
					}
				}
			else {
				break;
			}
			System.out.println(sum);
			sc.close();
		}
	}
}

