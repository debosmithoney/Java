package Scalar;

public class RotSortBinSearch {
  public static void main(String[] args) {
    int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
    int arr2[] = { 1, 7, 67, 133, 178 };
    System.out.println(getLoc(arr, 10));
    System.out.println(getLoc(arr2, 67));
  }
  public static int pivot3(int[] A,int B) {
    int n = A.length;
    int pivot = pivot(A, 0, n - 1);
    if (pivot == -1)
      return binSearch(A, 0, n - 1, B);
    if (A[pivot] == B)
      return pivot;
    if (A[0] <= B)
      return binSearch(A, 0, pivot - 1, B);
    return binSearch(A, pivot + 1, n - 1, B);

  }

  public static int getLoc(int A[], int B) {
    int piv = pivot(A, 0, A.length - 1);
    if (piv == -1)
      binSearch(A, 0, A.length - 1, B);
    if (A[piv] == B)
      return piv;
    if (A[0] <= B)
      return binSearch(A, 0, piv - 1, B);
    return binSearch(A, piv + 1, A.length - 1, B);
  }

  public static int pivot(int arr[], int low, int high) {
    if (high < low)
      return -1;
    if (high==low)
      return low;
    int mid = (low + high) / 2;
    if (mid < high && arr[mid] > arr[mid + 1])
      return mid;
    if (mid > low && arr[mid] < arr[mid - 1])
      return (mid - 1);
    if (arr[low] >= arr[mid])
      return pivot(arr, low, mid - 1);
    return pivot(arr, mid + 1, high);
  }

  public static int binSearch(int[] arr, int low, int high, int key) {
    if (low > high)
      return -1;
    int mid = (low + high) / 2;
    if (arr[mid] == key)
      return mid;
    if (arr[mid] < key)
      return binSearch(arr, mid + 1, high, key);
    else
      return binSearch(arr, low, mid - 1, key);
  }
}
