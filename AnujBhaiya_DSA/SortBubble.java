package AnujBhaiya_DSA;

public class SortBubble {
  public static void main(String[] args) {
    int arr[] = { 4, 3, 7, 1, 5 };
    int arr2[] = bubbleSort(arr);
    for (int i = 0; i < arr2.length; i++) {
      System.out.print(arr2[i] + " ");
    }
  }

  static void swap(int a[], int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  public static int[] bubbleSort(int arr[]) {
    int c = 0;
    for (int i = 0; i < arr.length; i++) {
      boolean swapped = false;
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j + 1] < arr[j]) {
          c++;
          swapped = true;
          System.out.println(c);
          swap(arr,j+1,j);
        }
      }
      if(!swapped) break;
    }
    return arr;
  }
}
