

/*s1={"ab"."c"}
 * s2={"a","bc"}*/
import java.util.Arrays;
public class anagramEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("The Strings in array:");
		String[] s1 = {"a","bc"};
		String[] s2 = {"bc","a"};
		
		String a = String.join (" ",s1);
		String b = String.join (" ",s2);
		
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(b1);
		
		if(Arrays.equals(a1, b1))
			System.out.print("Anagram");
		else
			System.out.print("Not Anagram");
	}

}
