import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size:");
		n=sc.nextInt();
		int [] a= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("The array with Dupicates :"+" ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("The duplicates removed array :"+" ");
		for (int i=0;i<n;i++) {
			for (int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					a[j]=0;
				}
			}
			if(a[i]!=0) {
			System.out.print(a[i]+" ");
			}
		}
		sc.close();
	}

}
