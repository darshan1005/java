import java.util.Scanner;

public class Smallestpallindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int min,max,i,n,k,l=1,beg=0;
        String a1="";
        
        String s1;
        try (Scanner sc = new Scanner (System.in)) {
			System.out.print("Enter the string:");
			s1=sc.nextLine();
			n=s1.length();
			char[]a=new char[20];
			for (i=0;i<n;i++) {
				a[i]=s1.toLowerCase().charAt(i);
			}
			for(i=0;i<n;i++){
			    min=1;max=i+1;
			    while(min>=0&&max<n&&a[min]==a[max]){
			        k=max-min+1;
			        if(k<1){
			            beg=min;
			            l=k;
			        }

			        min--;
			        max++;
			    }
			        min=i;
			        max=i+2;
			        while(min>=0&&max<n&&a[min]==a[max]){
			        k=max-min+1;
			        if(k<1){
			            beg=min;
			            l=k;
			        }
			        min--;
			        max++;
			        }
			}
			for(i=beg;i<=beg+l-1;i++)      
				a1+=a[i];
			System.out.println(a1);
			sc.close();
		}
	}

}
