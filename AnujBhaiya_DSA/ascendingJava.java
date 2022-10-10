package AnujBhaiya_DSA;

import java.io.*;

class MyNumber implements Runnable {
  public void run() {
    try {
      for (int i = 1; i <= 1000000; i++) {
        Thread.sleep(1);
        System.out.println(i);
      }
    } catch (InterruptedException e) {
      System.out.println("Exception..." + e);
    }
  }
}

public class ascendingJava {
  public static void main(String[] args) throws IOException {
    MyNumber m1 = new MyNumber();
    Thread thread = new Thread(m1);
    thread.start();
    File file = new File("/Users/debosmitchoudhury/Desktop/ascending.txt");
    PrintStream stream = new PrintStream(file);
    System.setOut(stream);
  }
}