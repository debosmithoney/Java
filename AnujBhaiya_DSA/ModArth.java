package AnujBhaiya_DSA;
//Modulo = 10^9 +7;

public class ModArth {
  public static void main(String[] args) {
    System.out.println(fastPower(3978432, 5,1000000007));
  }

  public static long fastPower(long a, long b, int n) {
    long res = 1;
    while (b > 0) {
      if ((b & 1) != 0) {
        res = (res * a % n) % n;
      }
      a = (a % n * a % n) % n;
      b >>= 1;
    }
    return res;
  }
}
