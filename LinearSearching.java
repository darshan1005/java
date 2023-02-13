/*LINEar search*/

import java.util.Scanner;

public class LinearSearching {
	static boolean linear(int a[],int n,int index,int key) {
		
		if(n==0)
			return false;
		if(index==n)
			return false;
		if(a[index]==key)
			return true;
		else
			return linear(a,n,index+1,key);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int key = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		if(linear(a,n,0,key)) {
			System.out.print("Key found");
		}
		else {
			System.out.println("Not found");
		}
		
	}

}
