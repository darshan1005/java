import java.util.Arrays;
import java.util.Scanner;

/*AnagramSTRING or not*/
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1;
		String s2;
		char []a = new char[20],b=new char[20];
		boolean t;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the string1:");
		s1=sc.nextLine();
		System.out.print("Enter the string2:");
		s2=sc.nextLine();
		
		if(s1.length()!=s2.length()) {
			
			t=false;
		}
		else {
		for (int i=0;i<s1.length();i++) {
			a[i]=s1.toLowerCase().charAt(i);
			b[i]=s1.toLowerCase().charAt(i);
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		t=Arrays.equals(a, b);
		
		}
		
		if(t)
			System.out.println("Anagram");
		else {
			System.out.println("Not anagram");
		}
		sc.close();
	}

}
