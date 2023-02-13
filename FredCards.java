import java.util.Scanner;

public class FredCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,arrsum=0;
		int min=9999,result=0;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int a[] = new int [n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			}
		
		for(int i=0;i<n;i++) {
			arrsum+=a[i];
		}
		System.out.println("Arry sum:"+arrsum);
		
		for(int i=0;i<n;i++) {
			if(a[i]<0) {
				sum = a[i];
			for(int j=i+1;j<n && a[j]<0;j++) {
				sum +=a[j];
			}
			
			if(min>sum)
				min=sum;
			}
		}
		result = arrsum - 2*min;
		System.out.println("Result :"+result);
		sc.close();
	}

}
