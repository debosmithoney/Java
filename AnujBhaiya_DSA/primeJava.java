package AnujBhaiya_DSA;

import java.io.*;
import java.util.Arrays;

public class primeJava {
  public static void main(String[] args) throws IOException {
    MyNumber m1 = new MyNumber();
    Thread thread = new Thread(m1);
    thread.start();
    File file = new File("/Users/debosmitchoudhury/Desktop/prime.txt");
    PrintStream stream = new PrintStream(file);
    System.setOut(stream);
  }
}

class MyNumber implements Runnable {
  public void run() {
    try {
      boolean[] isPrime = seiveOfEratoStehnes(2000000);
      for (int i = 0; i < isPrime.length; i++) {
        if (isPrime[i]) {
          Thread.sleep(1);
          System.out.println(i);
        }
      }
    } catch (InterruptedException e) {
      System.out.println("Exception..." + e);
    }
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
}
