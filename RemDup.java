public class RemDup {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1])
                nums[++k] = nums[i];
        }
        return ++k;
    }

    public static void main(String[] args) {
        RemDup rem = new RemDup();
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(rem.removeDuplicates(nums));
    }
}
