package AnujBhaiya_DSA;

import java.util.*;

public class SubArraySum {
  public static void main(String[] args) {
    int[] arr = { 10, 15, -5, 15, -10, 5 };
    System.out.println(getSubArrSum(arr, -5));
  }

  public static ArrayList<Integer> getSubArrSum(int[] arr, int sum) {
    int curSum = 0;
    int start = 0;
    int end = -1;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    ArrayList<Integer> result = new ArrayList<Integer>();
    for (int i = 0; i < arr.length; i++) {
      curSum += arr[i];
      if (curSum - sum == 0) {
        start = 0;
        end = i;
        break;
      }
      if (map.containsKey(curSum - sum)) {
        start = map.get(curSum - sum) + 1;
        end = i;
        break;
      }
      map.put(sum, i);
    }
    if (end != -1) {
      result.add(start);
      result.add(end);
    }
    return result;
  }
}
