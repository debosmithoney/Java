package AnujBhaiya_DSA;

public class SortMerge {
  public static void main(String[] args) {
    int[] a = { 4, 6, 2, 5, 7, 9, 1, 3 };
    mergeSort(a, 0, a.length - 1);
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }

  public static void mergeSort(int[] a, int left, int right) {
    if (left < right) {
      int mid = (left + right) / 2;
      System.out.println(right + " " + mid);
      mergeSort(a, left, mid);
      mergeSort(a, mid + 1, right);
      merge(a, left, mid, right);
    }
  }

  public static void merge(int a[], int left, int mid, int right) {
    int b[] = new int[a.length];
    int i = left;
    int j = mid + 1;
    int k = left;
    while (i <= mid && j <= right) {
      if (a[i] < a[j]) {
        b[k] = a[i];
        i++;
      } else {
        b[k] = a[j];
        j++;
      }
      k++;
    }
    if (i > mid) {
      while (j <= right) {
        b[k] = a[j];
        k++;
        j++;
      }
    } else {
      while (i <= mid) {
        b[k] = a[i];
        k++;
        i++;
      }
    }
    for (k = left; k <= right; k++) {
      a[k] = b[k];
    }
  }
}
