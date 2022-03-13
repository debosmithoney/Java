//Stack Data Structure using LinkedList
package AnujBhaiya_DSA;

public class StackBaseLL {
  class Node {
    int data;

    public Node(int data) {
      this.data = data;
    }

    Node next;
  }

  Node head;
  int size;

  public static void main(String[] args) throws Exception {
    StackBaseLL obj = new StackBaseLL();
    obj.push(24);
    obj.push(65);
    obj.push(53);
    obj.push(34);
    obj.push(2);
    obj.push(72);
    obj.push(53);
    obj.push(31);
    System.out.println(obj.peak());
  }

  public StackBaseLL() {
    head = null;
    size = 0;
  }

  void push(int data) {
    Node temp = new Node(data);
    temp.next = head;
    size++;
    head = temp;
  }

  int peak() throws Exception {
    if (head == null)
      throw new Exception();
    return head.data;
  }

  int pop() throws Exception {
    if (head == null)
      throw new Exception();
    int res = head.data;
    head = head.next;
    size--;
    return res;
  }

  boolean isEmpty() {
    return head == null;
  }

  int size() {
    return size;
  }
}
