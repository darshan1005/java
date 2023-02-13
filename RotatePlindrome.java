import java.util.Arrays;

public class RotatePlindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "CBAABCD";

	    String reverseStr = "";
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toUpperCase().equals(reverseStr.toUpperCase())) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	     
	      char a[] = new char[strLength];
	      for (int i=0;i<strLength;i++) {
	    	  a[i] = str.toUpperCase().charAt(i);
	      }
	    char b[] = new char[strLength]; 
	    for (int i=strLength-1;i>=0;i--) {
	    	b[i-1] = a[i];
	    }
	    b[strLength-1]=a[0];
	    
	    String Str2 = Arrays.toString(b);
		if (str.toUpperCase().equals(Str2.toUpperCase())) {
		      System.out.println(str + " is a Palindrome String.");
		    }
		else {
			return;
		}
	    }
	}

}
