
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				for(int j=0;j<n;j++) {
					System.out.print((n*i)+j+1+" ");
				}
				System.out.println();
			}
			else {
				for(int j=0;j<5;j++) {
					System.out.print(n*(i+1)-j+" ");
					
				}
				System.out.println();
			}
		}
	}

}
