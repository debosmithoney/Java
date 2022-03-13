//Maximum area of Histogram
package AnujBhaiya_DSA;

import java.util.*;

public class MaxArHist {
  public static void main(String[] args) {
    int a[] = { 4, 2, 1, 5, 6, 3, 2, 4, 2 };
    System.out.println(maxArea(a));
  }

  public static int maxArea(int a[]) {
    int maxAns = 0;
    int prev[] = prevSmallerElement(a);
    int next[] = nextSmallElement(a);
    for (int i = 0; i < a.length; i++) {
      int cur = (next[i] - prev[i] - 1) * a[i];
      maxAns = Math.max(maxAns, cur);
    }
    return maxAns;
  }

  public static int[] prevSmallerElement(int[] a) {
    int b[] = new int[a.length];
    Stack<Integer> stack = new Stack<Integer>();
    for (int i = 0; i < a.length; i++) {
      while (!stack.isEmpty() && a[stack.peek()] >= a[i]) {
        stack.pop();
      }
      if (stack.isEmpty())
        b[i] = -1;
      else
        b[i] = stack.peek();
      stack.push(i);
    }
    return b;
  }

  public static int[] nextSmallElement(int[] a) {
    int b[] = new int[a.length];
    Stack<Integer> stack = new Stack<Integer>();
    for (int i = a.length - 1; i >= 0; i--) {
      while (!stack.isEmpty() && a[stack.peek()] <= a[i]) {
        stack.pop();
      }
      if (stack.isEmpty())
        b[i] = -1;
      else
        b[i] = stack.peek();
      stack.push(i);
    }
    return b;
  }
}
