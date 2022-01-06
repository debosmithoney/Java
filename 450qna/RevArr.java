public class RevArr {
    static void reverse(int[] arr, int start, int end) {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        reverse(arr, 0, 9);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
