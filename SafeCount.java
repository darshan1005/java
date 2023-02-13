
public class SafeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat =
	        {
	            { 1, 1, -1, 1, 1 },
	            { 1, 0, 0, -1, 1 },
	            { 1, 1, 1, 1, -1 },
	            { -1, -1, 1, 1, 1 },
	            { 1, 1, -1, -1, 1 }
	        };
		
//		int count =0;
		int unsafe=-1;
		
		for (int i=0;i<mat.length;i++) {
			for (int j=0;j<mat[0].length;j++) {
				if(i%2==0) {
					if (mat[i][j]==unsafe) {
					
					}
					else {
						j++;
					}
			}
			}
		}
		
	}

}