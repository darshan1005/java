//import java.util.Arrays;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int arr[]={7,2,3,1,5,4,8};
		        int sum=0;
		        for (int i=0;i<arr.length;i++){
		            sum +=arr[i];
		        }
		        sum=sum/3;
		        System.out.println(sum);
		        for(int i=0;i<arr.length;i++){
		            for (int j=i+1;j<arr.length;j++){
		                if(arr[i]+arr[j]==sum){
		                    System.out.println(arr[i]+" "+arr[j]);
		                    arr[i]=0;
		                    arr[j]=0;

		                }

		                }
		            }
//		       int sum1= Arrays.stream(arr).sum();
		        for (int i=0;i<arr.length;i++){
		            if(arr[i]!=0){
		                System.out.print(arr[i]+" ");
		               
		            }


		        }
		        System.out.println("YES");
		        
	}

}
