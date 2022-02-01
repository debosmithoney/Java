import java.util.*;

public class sim2Arr {
    public static ArrayList<Integer> findSimilarity(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m) {
        Collections.sort(arr1);
        Collections.sort(arr2);
        int i = 0, j = 0, c = 0;
        while (i < n && j < m) {
            if (arr1.get(i) == arr2.get(j)) {
                c++;
                i++;
                j++;
            } else if (arr1.get(i) > arr2.get(j))
                j++;
            else
                i++;
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(c);
        result.add(n + m - c);
        return result;
    }

}