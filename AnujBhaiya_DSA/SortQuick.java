package AnujBhaiya_DSA;

public class SortQuick {
  public static void main(String[] args) {
    int[] arr = { 4, 6, 2, 5, 7, 9, 1, 3 };
    quickSort(arr, 0, arr.length);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i] + " ");
    }
  }

  static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  };

  static int partition(int[] a, int l, int h) {
    int pivot = a[l];
    int i = l, j = h;
    while (i < j) {
      while (a[i] <= pivot)
        i++;
      while (a[j] >= pivot)
        j--;
      if (i < j)
        swap(a, i, j);
    }
    swap(a, j, l);
    return j;
  };

  static int quickSort(int[] a, int l, int h) {
    int pivot;
    if (l < h) {
      pivot = partition(a, l, h);
      quickSort(a, l, pivot - 1);
      quickSort(a, pivot + 1, h);
    }
    return -1;
  }
}
