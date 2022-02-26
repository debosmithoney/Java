package gfg;

import java.util.*;

public class PrimeRange {
  public static void main(String[] args) {
    System.out.println(primeRange(1,10));
  }
  static ArrayList<Integer> primeRange(int M, int N) {
    // code here
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for (int i = M; i <= N; i++) {
      if (isPrime(i))
        arr.add(i);
    }
    return arr;
  }

  static boolean isPrime(int n) {
    int c = 0;
    for (int i = 1; i <= n / 2; i++) {
      if (n % i == 0)
        c++;
    }
    if (c == 1)
      return true;
    return false;
  }
}
