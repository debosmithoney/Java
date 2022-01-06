
import java.util.Arrays;

class SwapAlt {

    void SwapSAlternate(int arr[], int size) {
        int temp = 0;
        for (int i = 0; i < size; i = i + 2) {
            if (i + 1 < size) {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        int b[] = { 0, 2, 4, 6, 8, 10 };
        SwapAlt obj = new SwapAlt();
        obj.SwapSAlternate(a, a.length);
        obj.SwapSAlternate(b, b.length);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}