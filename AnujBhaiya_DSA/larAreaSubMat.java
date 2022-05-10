package AnujBhaiya_DSA;

// Largest Area submatrix
import java.util.*;

public class larAreaSubMat {
  public static void main(String[] args) {
    int a[][] = {
        { 1, 0, 1, 0, 0 },
        { 1, 0, 1, 1, 1 },
        { 1, 1, 1, 1, 1 },
        { 1, 0, 0, 1, 0 },
        { 1, 0, 1, 1, 1 } };
    System.out.println(maxAreaSubMatrix(a));
  }

  public static int maxAreaSubMatrix(int[][] a) {
    int curRow[] = a[0];
    int maxAnswer = maxArea(curRow);
    for (int i = 1; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        if (a[j][i] == 1)
          curRow[j] += 1;
        else
          curRow[j] = 0;
      }
      int curAns = maxArea(curRow);
      maxAnswer = Math.max(maxAnswer, curAns);
    }
    return maxAnswer;
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
