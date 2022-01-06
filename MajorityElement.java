public class MajorityElement {
    public int majorityElement(int[] nums) {
        int c = 0, el = 0, i = 0;
        while (i < nums.length) {
            if (c == 0)
                el = nums[i];
            c+=(el==nums[i]) ?1:-1;
            i++;
        }
        return el;
    }

    public static void main(String[] args){
        int[] nums = {2,2,1,1,1,2,2};
        MajorityElement obj = new MajorityElement();
        System.out.println(obj.majorityElement(nums));
    }
}
