class rect {

  public static void main(String args[]) {
    Rectangle r1 = new Rectangle();
    System.out.println("Area of r1: " + r1.area());
    Rectangle r2 = new Rectangle(20, 30);
    System.out.println("Area of r2: " + r2.area());
    Rectangle r3 = new Rectangle(10);
    System.out.println("Area of r3: " + r3.area());
  }

}

class Rectangle {

  int length, width;

  Rectangle() {
    this.length = 0;
    this.width = 0;
  }

  Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  Rectangle(int length) {
    this.length = length;
    this.width = length;
  }

  int area() {
    return length * width;
  }

}
