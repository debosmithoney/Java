package Scalar;

import java.util.*;

public class XorSubArr {
  public int solve(ArrayList<Integer> A) {
    if (A.size() % 2 == 0)
      return 0;
    int ans = 0;
    for (int i = 0; i < A.size(); i += 2) {
      ans = ans ^ A.get(i);
    }
    return ans;
  }

  public static void main(String[] args) {
    
  }
}
