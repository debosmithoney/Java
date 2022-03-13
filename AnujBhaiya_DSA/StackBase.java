//Stack Data Structure using Array

package AnujBhaiya_DSA;

public class StackBase {
  int a[];
  int top;
  int capacity;

  public StackBase(int capacity) {
    this.capacity = capacity;
    top = -1;
    a = new int[capacity];
  }

  public static void main(String[] args) throws Exception {
    StackBase obj = new StackBase(5);
    obj.push(2);
    obj.push(3);
    obj.push(4);
    obj.push(5);
    obj.push(6);
    System.out.println(obj.peek());
    obj.pop();
    System.out.println(obj.peek());
  }

  void push(int data) throws Exception {
    if (top == capacity - 1)
      throw new Exception();
    top++;
    a[top] = data;
  }

  int pop() throws Exception {
    if (top == -1)
      throw new Exception();
    int res = a[top];
    top--;
    return res;
  }

  int peek() throws Exception {
    if (top == -1)
      throw new Exception();
    return a[top];
  }

  boolean isEmpty() {
    return top == -1;
  }
}
