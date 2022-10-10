package Virtusa;

public class middleEle {
  static int findElement(int[] arr, int n) {
    int[] leftMax = new int[n];
    leftMax[0] = Integer.MIN_VALUE;

    for (int i = 1; i < n; i++)
      leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);

    int rightMin = Integer.MAX_VALUE;

    for (int i = n - 1; i >= 0; i--) {
      if (leftMax[i] < arr[i] && rightMin > arr[i])
        return arr[i - 1];

      rightMin = Math.min(rightMin, arr[i]);
    }

    return -1;

  }

  public static void main(String args[]) {
    int[] arr = { 4, 3, 2, 7, 8, 9 };
    int n = arr.length;
    System.out.println("Index of the element is " +
        findElement(arr, n));
  }
}
