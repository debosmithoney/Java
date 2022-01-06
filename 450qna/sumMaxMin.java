//Link: https://www.codingninjas.com/codestudio/problems/sum-of-max-and-min_1081476?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0

public class sumMaxMin {
    public static int sumOfMaxMin(int[] arr, int n) {
        // Write your code here.
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }
        return max + min;
    }

    public static void main(String[] args) {
        int arr[] = { -1, -4, 5, 8, 9, 3 };
        System.out.println(sumMaxMin.sumOfMaxMin(arr, arr.length));
    }
}
