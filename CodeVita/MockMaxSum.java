package CodeVita;

import java.util.*;

public class MockMaxSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int W = sc.nextInt();
    int D = sc.nextInt();
    int arr[] = new int[N];
    System.out.println("Enter elements");
    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    int A = maxSum(arr, arr.length, W);
    int B = maxSum(arr, arr.length, W + D);
    System.out.println(A>B?"Wrong "+(A-B):"Right "+(B-A));
  }

  public static int maxSum(int arr[], int n, int k) {
    if (n < k) {
      return -1;
    }
    int max = 0;
    for (int i = 0; i < k; i++)
      max += arr[i];
    int currSum = max;
    for (int i = k; i < n; i++) {
      currSum += arr[i] - arr[i - k];
      max = Math.max(max, currSum);
    }
    return max;
  }
}
