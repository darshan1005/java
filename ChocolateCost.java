import java.util.Scanner;

public class ChocolateCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=-1,i,j,n,sum=0;
		int [][]a= {{1,2,3,},{4,5,6},{7,8,9}};
		try (Scanner sc = new Scanner(System.in)) {
			n=sc.nextInt();
			for(i=0;i<n;i++) {
				int min=9999;
				for(j=0;j<n;j++) {
					if(x==j)
						continue;
					if(min>a[i][j]) {
						min=a[i][j];
						x=j;
					}
						
				}
				sum = sum+min;
			}
			

			System.out.println(sum);
			sc.close();
		}
	}
}
