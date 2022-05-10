package AnujBhaiya_DSA;

import java.util.*;

class AlmostSorted {
  public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();

    sc.close();

    int x = -1, y = -1;

    for (int i = 1; i < n; i++) {
      if (arr[i] < arr[i - 1]) {
        x = i - 1;
        while (x > 0 && arr[x] > arr[i])
          x--;
        break;
      }
    }

    if (x == -1) {
      System.out.print("-1 -1");
      return;
    }

    for (int i = x + 1; i < n; i++) {
      if (arr[i] > arr[x]) {
        y = i - 1;
        break;
      }
    }

    if (y == -1 || arr[n - 1] < arr[x])
      y = n - 1;

    x += 1;
    y += 1;

    System.out.printf("%d %d", x, y);
  }
}