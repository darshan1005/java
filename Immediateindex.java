import java.util.Scanner;

public class Immediateindex {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner (System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			
			for (int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			int i=0;
				for (int j=i+1;j<n;j++) {
					
					if (a[i]>a[j]) {
						int index = j;
						System.out.print(index+" ");
					}
					else
						System.out.print("-1"+" ");
					i++;
				}
		}
	}

}
