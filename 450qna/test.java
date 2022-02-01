public class test {
  public static void main(String[] args) {
    Test2 s1 = new Test2();
    s1.start();
  }
}

class Test2 implements Test1 {

  public void start() {
    System.out.println("Start");
  }

}

interface Test1 {
  void start();
}