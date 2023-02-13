
import java.util.Scanner;

public class BinarySearch {

	static boolean Binary(int a[],int key,int low,int high) {
		int mid;
		if(low>high) {
			return false;
		}
		mid = (high+low)/2;
		while(low<=high) {
			if(a[mid]==key)
				return true;
			else if(a[mid]<key) {
				low = mid+1 ;
				high = high;
				return Binary(a,key,low,high);
			}
			else {
				low = low ;
				high = mid-1;
				Binary(a,key,low,high);
			}
			mid = (high+low)/2;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int key = sc.nextInt();
		int n=sc.nextInt();
		int[] a=new int[n];
		
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
	
		if(Binary(a,key,0,n-1))
			System.out.println("Key Found");
		else
			System.out.println("Key not Found");
	}

	public int binarySearch(int[] arr, int x) {
		// TODO Auto-generated method stub
		return 0;
	}
}
