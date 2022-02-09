package AnujBhaiya_DSA;

public class BinarySearch {
  public static int getLoc(int arr[], int k) {
    int low = 0;
    int high = arr.length;
    while (low < high) {
      int mid = (low + high) / 2;
      if (arr[mid] == k)
        return mid;
      else if (arr[mid] < k)
        low = mid + 1;
      else
        high = mid - 1;
    }
    return -1;
  }

  public static int getLoc1(int arr[], int low, int high, int k) {
    if (low > high)
      return -1;
    int mid = (low + high) / 2;
    if (arr[mid] == k)
      return mid;
    else if (arr[mid] < k)
      return getLoc1(arr, mid + 1, high, k);
    else
      return getLoc1(arr, low, mid - 1, k);
  }

  public static void main(String[] args) {
    int arr[] = { -4, -1, 3, 4, 7, 9, 10 };
    System.out.println(getLoc1(arr, 0, arr.length, 4));
  }
}
