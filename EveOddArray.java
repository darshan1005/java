import java.util.Arrays;
import java.util.Scanner;

public class EveOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,j=0;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the array size:");
		n=sc.nextInt();
		int [] arr1 = new int [n];
		int[] arr2 = new int [n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		Arrays.sort(arr1);
		for(int i=0;i<n;i++) {
			if(arr1[i]%2==0) {
				arr2[j++]=arr1[i];
			}
		}
		
			for(int i=0;i<n;i++) {
				if(arr1[i]%2==1) {
					arr2[j++]=arr1[i];
				}
			}
			System.out.print(Arrays.toString(arr2));
			sc.close();
		}
	}

