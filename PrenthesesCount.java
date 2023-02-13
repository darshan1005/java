import java.util.Scanner;

public class PrenthesesCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String s1;
		char[] a=new char[20];

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter our prentheses string:");
		s1=sc.nextLine();
		
		for (int i=0;i<s1.length();i++) {
			a[i]=s1.charAt(i);
		}
		for(int i=0;i<s1.length();i++) {
			
			if(a[i]=='(' && a[i+1]==')') 
				i+=2;
			else 
			count++;

		}
		
	System.out.println(count);
		sc.close();
	}
}
