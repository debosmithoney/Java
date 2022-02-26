package AnujBhaiya_DSA;

import java.util.*;

public class Heapify {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(10);
    list.add(30);
    list.add(50);
    list.add(20);
    list.add(15);
    list.add(5);
    // heapify(list, list.size(), 0);
    System.out.println(list);
    // sort(list);
    heapSort(list,list.size());
    System.out.println(list);
  }
  static void heapSort(ArrayList<Integer> arr , int n){
    for (int i = n-1; i >= 0; i--) {
      Collections.swap(arr,0,i);
      heapify(arr,arr.size(),0);
    }
  }

  public static void sort(ArrayList<Integer> arr) {
    int n = arr.size();
    for (int i = n / 2 - 1; i >= 0; i--)
      heapify(arr, n, i);
    System.out.println("MinHeap: ");
    for (int i = n - 1; i > 0; i--) {
      Collections.swap(arr, 0, i);
      heapify(arr, i, 0);
    }
    System.out.println(arr);
  }

  public static void heapify(ArrayList<Integer> a, int n, int i) {
    int largest = i;
    int l = 2 * i + 1;
    int r = 2 * i + 2;
    if (l < n && a.get(l) > a.get(largest))
      largest = l;
    if (r < n && a.get(r) > a.get(largest))
      largest = r;

    if (largest != i) {
      Collections.swap(a, largest, i);
      heapify(a, n, largest);
    }
  }
}
