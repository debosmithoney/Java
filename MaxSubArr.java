//Link: https://leetcode.com/problems/maximum-subarray/

public class MaxSubArr {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum = sum > 0 ? sum + nums[i] : nums[i];
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args){
        int[] num = {-2,1,-3,4,-1,2,1,-5,4};
        MaxSubArr obj = new MaxSubArr();
        System.out.println(obj.maxSubArray(num));
    }
}
