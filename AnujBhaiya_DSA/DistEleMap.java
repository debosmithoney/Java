package AnujBhaiya_DSA;

import java.util.*;

public class DistEleMap {
  public static void main(String args[]) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(2);
    list.add(1);
    list.add(3);
    list.add(1);
    list.add(1);
    list.add(3);
    System.out.println(distinctElements(list, 4));
  }

  public static ArrayList<Integer> distinctElements(ArrayList<Integer> arr, int k) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < k; i++) {
      map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);
    }
    System.out.println(map);
    result.add(map.size());
    for (int i = k; i < arr.size(); i++) {
      if (map.get(arr.get(i - k)) == 1) {
        System.out.println("Removed:" + arr.get(i - k));
        map.remove(arr.get(i - k));
      } else {
        System.out.println("Checked:" + arr.get(i - k));
        map.put(arr.get(i - k), map.get(arr.get(i - k)) - 1);
      }
      map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);
      System.out.println(map);

      result.add(map.size());
    }

    return result;
  }

}
