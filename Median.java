import java.util.Arrays;
import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[]= new int[n];
		int b[]= new int[m];
		
		//Array 1
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			System.out.print(a[i]+" ");
		}
		//Array 2
		for (int j=0;j<m;j++) {
			b[j]=sc.nextInt();
			System.out.print(b[j]+" ");
		}
		//lengths of the arrays
		int al = a.length;
		int bl = b.length;
		
		int[] c = new int[al+bl];
		//merging arrays
		System.arraycopy(a,0, c, 0, al);
		System.arraycopy(b,0, c, al, bl);
		//sorting merged arrays
		Arrays.sort(c);
		System.out.println();
		System.out.println(Arrays.toString(c));
		
		int cl = c.length;
		int z = Math.round( cl/2);
		if (cl%2!=0) {
			System.out.print(c[z]);
		}
		else {
			System.out.print(c[z-1]+" ");
			System.out.print(c[z]);
		}
		
		sc.close();
	}
}
