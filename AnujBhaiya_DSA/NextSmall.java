package AnujBhaiya_DSA;

import java.util.*;

public class NextSmall {
  public static void main(String[] args) {
    int a[] ={3,10,5,1,15,10,7,6};
    System.out.println("Next Smaller Elements in the Stack : ");
    nextSmallElement(a);
    System.out.println();
    System.out.println("Next Greater Elements in the Stack : ");
    nextGreaterElement(a);
  }

  public static void nextSmallElement(int a[]) {
    Deque<Integer> s = new ArrayDeque<Integer>();
    for (int i = a.length - 1; i >= 0; i--) {
      while (!s.isEmpty() && s.peek() >= a[i]) {
        s.pop();
      }
      if (s.isEmpty()) {
        System.out.print(-1 + " ");
      } else {
        System.out.print(s.peek()+" ");
      }
      s.push(a[i]);
    }
  }
  public static void nextGreaterElement(int a[]) {
    Deque<Integer> s = new ArrayDeque<Integer>();
    for (int i = a.length - 1; i >= 0; i--) {
      while (!s.isEmpty() && s.peek() <= a[i]) {
        s.pop();
      }
      if (s.isEmpty()) {
        System.out.print(-1 + " ");
      } else {
        System.out.print(s.peek()+"");
      }
      s.push(a[i]);
    }
  }
}
