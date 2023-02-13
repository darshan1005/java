import java.util.Scanner;

public class HastricHashCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int k,m;
		 int count=0,count1=0;
		String s1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		s1=sc.nextLine();
	
		char []c = new char[20];
		
		for (int i=0;i<s1.length();i++) {
			c[i]=s1.charAt(i);
		}
		for (int i=0;i<20;i++) {
			if(c[i]=='#') {
				count++;
			
			}
		}
		
		for (int i=0;i<20;i++) {
			if(c[i]=='*') {
				count1++;
				
			}
		}
		System.out.println(count);
		System.out.println(count1);
		k=count;
		m=count1;
		int l=k-m;
		System.out.println("The Count :"+l);
		sc.close();
	}

}
