public class Deadlock {
  public static Object Obj1 = new Object();
  public static Object Obj2 = new Object();

  public static void main(String args[]) {
    Deadlock1 d1 = new Deadlock1();
    Deadlock2 d2 = new Deadlock2();
    d1.start();
    d2.start();
  }

  private static class Deadlock1 extends Thread {
    public void run() {
      synchronized (Obj1) {
        System.out.println("1: Hold for Obj1");
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        System.out.println("1: Wait for Obj2");

        synchronized (Obj2) {
          System.out.println("1: Hold Obj1 & Obj2");
        }
      }
    }
  }

  private static class Deadlock2 extends Thread {
    public void run() {
      synchronized (Obj2) {
        System.out.println("2: Hold for Obj2");

        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
        };
        System.out.println("2: Wait for Obj1");

        synchronized (Obj1) {
          System.out.println("2: Hold Obj1 & Obj2");
        }
      }
    }
  }
}