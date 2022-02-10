package AnujBhaiya_DSA;

public class SearchInfy {
  public static void main(String[] args) {
   int[] n = {5,7,9,10,11,12,13,14,15,16,25};
   System.out.println(searchInfy(n,13)+1);
  }

  public static int searchInfy(int arr[], int key) {
    int low = 0;
    int high = 1;
    while (arr[high] < key) {
      low = high;
      high <<= 1;
    }
    return binSearch(arr, key, low, high);
  }

  public static int binSearch(int[] arr, int key, int low, int high) {
    if (low > high)
      return -1;
    int mid = (low + high) / 2;
    if (arr[mid] == key)
      return mid;
    else if (arr[mid] > key)
      return binSearch(arr, key, mid + 1, high);
    else
      return binSearch(arr, key, low, mid - 1);
  }
}
