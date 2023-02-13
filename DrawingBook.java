import java.util.Scanner;

public class DrawingBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n,p,front=0;
			int back;
			Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter number of pages:");
			System.out.println("Enter the page number:");
			n = sc.nextInt();
			p = sc1.nextInt();
			front=p/2;
			back=n-front;
			if(front<back) {
				System.out.println("Front:"+front);
				System.out.println("Back:"+back);
			}
			if(back==front) {
				System.out.println("Fool::your searching the last page");
			}
			else if(front<=0) {
				System.out.println("Memory loss::page number 0 is invalid");
			}
			else {
				System.out.println("Define a valid page number");
			
			}
			sc.close();
			sc1.close();	
	}

}
