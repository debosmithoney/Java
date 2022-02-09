package AnujBhaiya_DSA;

public class SortSelection {
  public static void main(String[] args) {
    int a[] = { 3, 2, 5, 1, 4, 8, 3, 2, 6 };
    int b[] = selectionSort(a);
    for (int i = 0; i < b.length; i++) {
      System.out.print(b[i] + " ");
    }

  }

  static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  public static int[] selectionSort(int[] a) {
    for (int i = 0; i < a.length; i++) {
      int min = i;
      for (int j = i + 1; j < a.length; j++) {
        if (a[j] < a[min])
          min = j;
      }
      if (min != i)
        swap(a, min, i);
    }
    return a;
  }
}
