class TestDemo{
  public static void main(String[] args) {
  Inf2 obj2 = new Demo();
  obj2.method1();
  obj2.method2();
  }
}

interface Inf1 {
  public void method1();
}

interface Inf2 extends Inf1 {
  public void method2();
}

class Demo implements Inf2 {
  public void method1() {
    System.out.println("Method1");
  };
  public void method2() {
    System.out.println("Method2");
  }
}