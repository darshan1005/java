import java.util.Scanner;

/*Display the string in the following format
 * input = sssaabbbsabbss
 * output = s3a2b3sab2s2
 * */


public class StringsChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		s = sc.nextLine();
		int count;
		char []s1 = new char[s.length()];
		for(int i=0;i<s.length();i++) {
			s1[i]=s.charAt(i);
		}
		for(int i=0;i<s.length();i++) {
			count=1;
			while(i<s.length()-1 && s1[i]==s1[i+1]) {
				count++;
				i++;
			}
			if(count==1)
				System.out.println(s1[i]);
			else
				System.out.println(s1[i]+" "+count);
		}
		sc.close();
	}

}


