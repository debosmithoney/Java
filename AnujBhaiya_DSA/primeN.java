package AnujBhaiya_DSA;

public class primeN {
  static int[] arr = new int[10];

  static boolean findPrime(int n, boolean isP[]) {
    isP[0] = isP[1] = false;
    for (int i = 2; i <= n; i++)
      isP[i] = true;

    for (int p = 2; p * p <= n; p++) {
      if (isP[p] == true) {
        for (int i = p * p; i <= n; i += p)
          isP[i] = false;
      }
    }
    return false;
  }

  static void getPair(int n) {
    boolean isP[] = new boolean[n + 1];
    findPrime(n, isP);

    for (int i = 0; i < n; i++) {
      if (isP[i] && isP[n - i]) {
        System.out.print(i + " " + (n - i));
        return;
      }
    }
  }

  public static void main(String[] args) {
    getPair(8);
  }
}
