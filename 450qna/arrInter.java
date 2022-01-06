//Link: https://www.codingninjas.com/codestudio/problems/intersection-of-2-arrays_1082149?source=youtube&campaign=love_babbar_codestudio1&utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_codestudio1&leftPanelTab=1

import java.util.*;

public class arrInter {
    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2,
            int m) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (arr1.get(i) == arr2.get(j)) {
                arr.add(arr1.get(i));
                i++;
                j++;
            } else if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return arr;
    }
}
