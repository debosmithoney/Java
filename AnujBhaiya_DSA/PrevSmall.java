//Previous Smaller Elements in Stack

package AnujBhaiya_DSA;

import java.util.*;

public class PrevSmall {
  public static void main(String[] args) {
    int a[] = { 4, 10, 5, 18, 3, 12, 7 };
    System.out.println("Previous Smaller Elements in Stack: ");
    prevSmallerElement(a);
    System.out.println();
    System.out.println("Previous Greater Elements in Stack: ");
    prevGreaterElement(a);
  }

  public static void prevSmallerElement(int a[]) {
    Stack<Integer> s = new Stack<Integer>();
    for (int i = 0; i < a.length; i++) {
      while (!s.isEmpty() && s.peek() >= a[i])
        s.pop();
      if (s.isEmpty())
        System.out.print(-1 + " ");
      else
        System.out.print(s.peek() + " ");
      s.push(a[i]);
    }
  }
  public static void prevGreaterElement(int a[]) {
    Stack<Integer> s = new Stack<Integer>();
    for (int i = 0; i < a.length; i++) {
      while (!s.isEmpty() && s.peek() <= a[i])
        s.pop();
      if (s.isEmpty())
        System.out.print(-1 + " ");
      else
        System.out.print(s.peek() + " ");
      s.push(a[i]);
    }
  }
}
