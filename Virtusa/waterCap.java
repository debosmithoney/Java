package Virtusa;

import java.util.*;

public class waterCap {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = s.nextInt();
    }
    System.out.println(answer(a));
    s.close();
  }

  public static int answer(int[] list) {
    int maxHeight = 0;
    int previousHeight = 0;
    int previousHeightIndex = 0;
    int coll = 0;
    int temp = 0;

    while (list[previousHeightIndex] > maxHeight) {
      maxHeight = list[previousHeightIndex];
      previousHeightIndex++;
      if (previousHeightIndex == list.length)
        return coll;
      else
        previousHeight = list[previousHeightIndex];
    }

    for (int i = previousHeightIndex; i < list.length; i++) {
      if (list[i] >= maxHeight) {
        coll += temp;
        temp = 0;
        maxHeight = list[i];
      } else {
        temp += maxHeight - list[i];
        if (list[i] > previousHeight) {
          int collWater = (i - previousHeightIndex) * (list[i] - previousHeight);
          coll += collWater;
          temp -= collWater;
        }
      }

      if (list[i] != previousHeight) {
        previousHeight = list[i];
        previousHeightIndex = i;
      }
    }
    return coll;
  }
}
