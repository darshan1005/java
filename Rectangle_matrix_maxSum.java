import java.util.Scanner;

public class Rectangle_matrix_maxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		/*int k1 = sc.nextInt();*/
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int a[][] = new int[n][m];
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				a[i][j] = sc.nextInt();
			}
		}
//		int sum=0;
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				System.out.println();
				for (int k=i;k<n;k++) {
					for (int l=j;l<m;l++) {
						System.out.print(a[k][l]+" ");
						
					}
				}
			}
		}
//		to be continued
		sc.close();
	}

}
