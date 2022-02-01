public class MinJumps {

    public static int minimumJumps(int[] arr, int N) {
        // Write your code here
        int j = 0;
        if (N == 0)
            return -1;
        if (N == 1)
            return 0;
        for (int i = 0; i < N;) {
            if (i + arr[i] > N - 1)
                return ++j;
            i += arr[i];
            j += 1;
            if (arr[i] == 0)
                return -1;
        }
        return j;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 7, 10, 3, 7, 8, 3, 7, 4 };
        System.out.println(MinJumps.minimumJumps(arr, arr.length));
    }

}
