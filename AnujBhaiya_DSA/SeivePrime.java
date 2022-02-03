package AnujBhaiya_DSA;

import java.util.Arrays;

public class SeivePrime {
  public static void main(String[] args) {
    boolean[] isPrime = SeivePrime.seiveOfEratoStehnes(20);
    for (int i = 0; i < isPrime.length; i++) {
      if (isPrime[i]) {
        System.out.println(i);
      }
    }
    System.out.println("GCD: "+ SeivePrime.gcd(24, 60));
  }

  public static boolean[] seiveOfEratoStehnes(int n) {
    boolean isPrime[] = new boolean[n + 1];
    Arrays.fill(isPrime, true);
    isPrime[0] = false;
    isPrime[1] = false;
    for (int i = 2; i * i <= n; i++) {
      for (int j = 2 * i; j <= n; j += i) {
        isPrime[j] = false;
      }
    }
    return isPrime;
  }

  public static int gcd(int a, int b) {
    if (b == 0)
      return a;
    return gcd(b, a % b);
  }
}
