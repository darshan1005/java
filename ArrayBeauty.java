import java.util.Arrays;

public class ArrayBeauty {
	public static void main(String[] args){
		 int arr[] = {1,4,7};
		    int count = 0;
		    int n = arr.length;
		    for(int i=0;i< (1<<n);i++) {
		        int s[] = new int[arr.length];
		        int r =0;
		        for(int j =0;j<n;j++){
		            if ((i & (1 << j)) > 0) {
		                s[r] = arr[j];
		                r++;
		            }
		            }
		            count = count + buaty(s);
		        }
		    System.out.println( "count =" + (count-1));
		}
		static int buaty(int ar[]) {
		    int w[] = new int[ar.length];
		    for(int i =0;i<ar.length;i++){
		        if(ar[i] != 0) {
		            w[i] = Integer.parseInt(Integer.toBinaryString(ar[i]));
		        }
		        else
		            break;
		    }
		    for(int i =0;i<w.length;i++){
		        if(w[i] != 0) {
		            w[i] = Integer.parseInt(Integer.toBinaryString(ar[i]));
		            
		        }
		        else
		            break;
		    }
		    int e =  Arrays.stream(w).sum();
		    int max = 1;
		    while(e != 0) {
		        int k = e%10;
		        if(k > max) {
		            max = k;
		        }
		        e = e/10;
		    }
		    return max;
		}
		}