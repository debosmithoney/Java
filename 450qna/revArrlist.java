import java.util.*;
import java.util.Collections;

public class revArrlist {
    public static void reverseArray(ArrayList<Integer> arr, int m) {
        // Write your code here.
        int s = m + 1, e = arr.size() - 1;
        while (s <= e) {
            Collections.swap(arr, e, s);
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++)
            a.add(arr[i]);
        revArrlist.reverseArray(a, 1);
        System.out.println(a);
    }

}
