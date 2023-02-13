import java.util.Arrays;
import java.util.Scanner;

public class SmallestPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		boolean flag = false;
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
			int[] b = new int[n];
			for(int i=0;i<n;i++)
			{
//				if array has no elements
				if (n<=0)
					break;
//				if array has negative value
				if (a[i]<0) {
					continue;
				}
//				if array not containing 1
				if(a.length == 1 || a[i]!=1) {
					flag = true;
					continue;
				}
				else
					break;

			}
				
			if (flag== true)
				System.out.println("1");
			
//			if array contains 1 
			else {
			for(int i=0;i<n;i++)
			{
				if(i+1!=n)
				{
			if (a[i]+1 == a[i+1] && i<n)
				continue;
			else
			{
				if (a[i]+1 != a[i+1] && i<n)
					
					b[i]=a[i]+1;
				    a[i]=a[i]+1;
				    
				    i--;
			}
			}
			}
			}
			Arrays.sort(b);
//			if second array contains 0 as first value
			if (b[0]!=0)
				System.out.print(b[1]);
			sc.close();
	}

}
