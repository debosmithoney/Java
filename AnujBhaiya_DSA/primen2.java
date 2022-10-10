package AnujBhaiya_DSA;

public class primen2 {
  static int[] arr = new int[10];

  static boolean prime(int N) {

    if (N <= 1)
      return false;

    for (int i = 2; i * i <= N; i++) {
      if (N % i == 0) {
        return false;
      }
    }

    return true;
  }

  static int[] getPrimes(int N) {
    for (int i = 2; i * i <= N; i++) {
      if (prime(N - i) && prime(i)) {
        arr[0] = i;
        arr[1] = N - i;
        return arr;
      }
    }

    arr[0] = -1;
    arr[1] = -1;
    return arr;
  }
}
