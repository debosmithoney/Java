import java.io.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) throws IOException {
        Solution obj = new Solution();
        int[] num = { 3,2,4};
        int[] y = obj.twoSum(num,6);
        for (int i = 0;i<y.length;i++) {
            System.out.print(y[i]+" ");
        }
    }
}