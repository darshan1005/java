import java.util.Scanner;

public class SubstringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,count=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array Size:");
		n=sc.nextInt();
		int [] a=new int [n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(a[i]==1){
				for(int j=i+1;j<n;j++) {
					if(a[j]==1) {
						count++;
					}
				}
			}
		}
		System.out.print("The possible combinations:"+count);
		sc.close();
	}

}
