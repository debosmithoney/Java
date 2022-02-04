package AnujBhaiya_DSA;

public class KadenAlgo {
  public static void main(String[] args) {
    int[] arr = {-5,4,2,-1,3,7,-6,1};
    System.out.println(maxSubarraySum(arr, arr.length));
  }
  public static long maxSubarraySum(int[] arr, int n) {
        long c=0,max=0;
        for(int i =0;i<n;i++){
            c+=arr[i];
            max = Math.max(c,max);
            if(c<0) c=0;
        }
        return max;
	}
  
}
