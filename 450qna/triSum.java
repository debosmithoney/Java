import java.util.*;

public class triSum {
    public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(arr);
        int l = 0, r = 0;
        for (int i = 0; i < n; i++) {
            l = i + 1;
            r = arr.length - 1;
            while (l < r) {
                if (arr[i] + arr[l] + arr[r] == K) {
                    ans.add(new ArrayList<>(Arrays.asList(arr[i], arr[l], arr[r])));
                    int x = arr[l];
                    int y = arr[r];
                    while (l < r && arr[l] == x)
                        l++;
                    while (l < r && arr[r] == y)
                        r--;
                } else if (arr[i] + arr[l] + arr[r] < K)
                    l++;
                else
                    r--;
            }
            while (i + l < arr.length && arr[i] == arr[i + 1])
                i++;
        }
        HashSet< HashSet<Integer> > ans2 = new HashSet< HashSet<Integer> >(); 
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(triSum.findTriplets(arr, arr.length, 11));
    }
}
