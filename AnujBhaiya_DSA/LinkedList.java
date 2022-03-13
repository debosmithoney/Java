package AnujBhaiya_DSA;

public class LinkedList {

  Node head;

  static class Node {

    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  public static LinkedList insert(LinkedList list, int data) {
    Node new_node = new Node(data);
    new_node.next = null;

    if (list.head == null) {
      list.head = new_node;
    } else {
      Node last = list.head;
      while (last.next != null) {
        last = last.next;
      }

      last.next = new_node;
    }
    return list;
  }

  public static void delete(Node head, int pos) {
    if (pos == 0) {
      head = head.next;
      return;
    }
    Node prev = head;
    for (int i = 0; i < pos - 1; i++) {
      prev = prev.next;
    }
    prev.next = prev.next.next;
  }

  public static void printList(LinkedList list) {
    Node currNode = list.head;

    System.out.print("LinkedList: ");
    while (currNode != null) {
      System.out.print(currNode.data + " ");
      currNode = currNode.next;
    }
  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list = insert(list, 1);
    list = insert(list, 2);
    list = insert(list, 3);
    list = insert(list, 4);
    list = insert(list, 5);
    list = insert(list, 6);
    list = insert(list, 7);
    list = insert(list, 8);
    delete(list.head, 1);
    printList(list);
  }
}
