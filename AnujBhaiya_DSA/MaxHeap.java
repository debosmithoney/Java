package AnujBhaiya_DSA;

import java.util.*;

public class MaxHeap {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(0);
    arr.add(50);
    arr.add(40);
    arr.add(45);
    arr.add(30);
    arr.add(20);
    arr.add(35);
    arr.add(10);
    insert(arr, 60);
    System.out.println(arr);
    delete(arr);
    System.out.println(arr);
  }

  static void insert(ArrayList<Integer> a, int n) {
    a.add(n);
    int i = a.size() - 1;
    while (i > 1) {
      int parent = i / 2;
      System.out.println(a.get(parent));
      if (a.get(parent) < a.get(i)) {
        Collections.swap(a, parent, i);
        i = parent;
      } else
        return;
    }
  }

  static void delete(ArrayList<Integer> a) {
    Collections.swap(a, 1, a.size()-1);
    a.remove(a.size()-1);
    int i = 1;
    while (i < a.size()-1) {
      int left = a.get(2 * i);
      int right = a.get(2 * i + 1);
      int larger = left > right ? 2 * i : 2 * 1 + 1;
      if (a.get(i) < a.get(larger)) {
        Collections.swap(a, larger, i);
        i = larger;
      } else
        return;
    }
  }
}
