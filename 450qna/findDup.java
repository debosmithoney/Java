//Link: https://leetcode.com/problems/unique-number-of-occurrences/

import java.util.*;

public class findDup {
    public static int findDuplicate(ArrayList<Integer> arr) {
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = ans ^ arr.get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            ans = ans ^ i;
        }
        return ans;
    }

    public static int findDupli(ArrayList<Integer> arr) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            if (!set.add(arr.get(i))) {
                return arr.get(i);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = { 1, 3, 2, 2, 2 };
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            arr.add(a[i]);
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        System.out.println(arr);
        System.out.println(findDup.findDupli(arr));
        System.out.println(findDup.findDuplicate(arr));
    }
}