package AnujBhaiya_DSA;

public class SortInsertion {
  public static void main(String[] args) {
    int a[] = {4,2,5,1,6,7,3};
    int b[] = insertionSort(a);
    for (int i = 0; i < b.length; i++) {
      System.out.print(b[i] + " ");
    }
  }

  public static int[] insertionSort(int[] a) {
    for (int i = 1; i < a.length; i++) {
      int temp = a[i];
      int j = i - 1;
      while (j >= 0 && a[j] > temp) {
        a[j + 1] = a[j];
        j--;
      }
      a[j + 1] = temp;
    }
    return a;
  }
}
