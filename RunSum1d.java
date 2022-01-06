public class RunSum1d {
    public int[] runningSum(int[] nums){
        int sum = 0;
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            sum+=nums[i];
            arr[i] = sum;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] array = {1,2,3,4};
        RunSum1d obj = new RunSum1d();
        int[] a = obj.runningSum(array);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
