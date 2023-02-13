import java.util.Scanner;

public class Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,target;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array Size:");
		n=sc.nextInt();
		int [] arr1 = new int [n];
		for(int i1=0;i1<n;i1++) {
		arr1[i1]=sc.nextInt();
		}
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter target:");
		target=sc1.nextInt();
		
		for(int i1=0;i1<n;i1++) {
			for(int j=0;j<n;j++) {
				if(arr1[i1]+arr1[j]==target) {
					System.out.println(arr1[i1]+" "+arr1[j]);
				}
			}
		}
		sc.close();
		sc1.close();
	}
}
