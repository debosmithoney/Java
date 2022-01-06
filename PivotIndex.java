public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int suml = 0, sumr = 0;
        for (int i = 0; i < nums.length; i++)
            sumr += nums[i];
        for(int i = 0; i < nums.length; i++){
            if(suml==sumr-nums[i]) return i;
            else
            {
                suml += nums[i];
                sumr -= nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        PivotIndex obj = new PivotIndex();
        System.out.println(obj.pivotIndex(nums));

    }
}
