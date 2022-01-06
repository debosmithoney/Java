//Link: https://leetcode.com/problems/unique-number-of-occurrences/

import java.util.*;

public class uniqOcc {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        Set<Integer> s = new HashSet<Integer>();
        for (int i : map.values()) {
            s.add(i);
        }
        if (s.size() == map.size())
            return true;
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };
        System.out.println(uniqOcc.uniqueOccurrences(arr));
    }
}