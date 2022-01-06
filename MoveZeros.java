public class MoveZeros {
    public int[] moveZeroes(int[] nums) {
        int k = 0;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                arr[k++] = nums[i];
        }
        while (k < nums.length) {
            arr[k++] = 0;
        }
        for (int i = 0; i < nums.length; i++)
            nums[i] = arr[i];
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        MoveZeros obj = new MoveZeros();
        int[] nums1 = obj.moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}
