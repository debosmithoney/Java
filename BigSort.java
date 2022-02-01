import java.util.*;
import java.lang.String;

public class BigSort {
  public static List<String> bigSorting(List<String> unsorted) {
    // Write your code here
    Collections.sort(unsorted,
        (x, y) -> x.length() == y.length() ? x.compareTo(y) : Integer.compare(x.length(), y.length()));
    return unsorted;
  }

  public static void main(String[] args) {
    List<String> gfg = new ArrayList<String>();
    String[] ar = { "31415926535897932384626433832795", "1", "3", "10", "3", "5" };
    for (int i = 0; i < ar.length; i++) {
      gfg.add(ar[i]);
    }
    List<String> result = BigSort.bigSorting(gfg);
    System.out.println(result);
  }
}
