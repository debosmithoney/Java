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

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 5, 7, 8 };
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            arr.add(a[i]);
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        System.out.println(arr);
        System.out.println(findDup.findDuplicate(arr));
    }
}