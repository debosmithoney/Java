import java.util.*;

public class findAllDup {
    public static List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        List<Integer> result = new ArrayList<Integer>();
        Set<Map.Entry<Integer, Integer>> data = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : data) {
            if (entry.getValue() > 1)
                result.add(entry.getKey());
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findAllDup.findDuplicates(nums));
    }
}
