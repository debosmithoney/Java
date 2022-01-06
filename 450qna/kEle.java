import java.util.*;

public class kEle {
    public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
        // Write your code here
        Collections.sort(arr);
        int s = arr.get(-k);
        int g = arr.get(k - 1);
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(s);
        a.add(g);
        return a;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 2 };
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++)
            a.add(arr[i]);
    }
}
