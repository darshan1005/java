import java.util.Scanner;

public class WaterLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int res=0,n;
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Array Size:");
			n=sc.nextInt();
			int [] a= new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				System.out.print(a[i]+" ");
			}
			for(int i=0;i<n;i++) {
				int lmax = a[i];
				for(int j=i-1;j>=0;j--) {
					lmax = lmax>a[j]?lmax:a[j];
				}
				
				int rmax = a[i];
				for(int j=i+1;j<n;j++) {
					rmax = rmax>a[j]?rmax:a[i];
				}
				res = res+(lmax<rmax?lmax:rmax)-a[i];
			}
			
			System.out.println();
			System.out.println("Result :"+" "+res);
			sc.close();
	}
	

}
