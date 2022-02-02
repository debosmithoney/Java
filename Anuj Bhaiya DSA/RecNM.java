public class RecNM {
  public static void main(String[] args) {
    System.out.println(RecurWays(2, 4));
    System.out.println(joshpheus(5, 3));
  }

  static int RecurWays(int n, int m) {
    if (n == 1 || m == 1)
      return 1;
    return RecurWays(n - 1, m) + RecurWays(n, m - 1);
  }

  static int joshpheus(int n, int k) {
    if (n == 1)
      return 0;
    return (joshpheus(n - 1, k) + k) % n;
  }

}
