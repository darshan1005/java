import java.util.Arrays;
import java.util.Scanner;

public class Mappingachar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		String s2;
		char[] a = new char[20],b=new char[20];
		boolean f=true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string1:");
		s1=sc.nextLine();
		System.out.print("Enter the string2:");
		s2=sc.nextLine();
		
		if(s1.length()!=s2.length()) {
			f=false;
			
		}
		
		else {
			for(int i=0;i<s1.length();i++) {
				a[i]=s1.toLowerCase().charAt(i);
				b[i]=s2.toLowerCase().charAt(i);
			}
			Arrays.sort(a);
			Arrays.sort(b);
		
	
		for(int i=0;i<20;i++) {
			for(int j=i+1;j<20;j++) {
				if(a[i]==a[j] && b[i]==b[j]) {
					f=false;
				}
				}
			}
		}
		
		
		if(f) 
			System.out.println("Mapping");
		
		else 
			System.out.println("Not mapping because : -");
			System.out.println("-->Strings are Not same lenght");
			System.out.println("or");
			System.out.println("-->Repeative CHARS");
		sc.close();
	}

}
