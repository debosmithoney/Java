import java.util.*;

public class pSum {
    public static int[][] pairSum(int[] arr, int s) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == s) {
                    ArrayList<Integer> l = new ArrayList<>();
                    l.add(Math.min(arr[i], arr[j]));
                    l.add(Math.max(arr[i], arr[j]));
                    list.add(l);
                }

            }
        }
        int[][] ans = new int[list.size()][2];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = list.get(i).get(j);
            }
        }
        Arrays.sort(ans, (a, b) -> Integer.compare(a[0], b[0]));
        return ans;
    }
}