//Find Median of Running stream of Integers
package AnujBhaiya_DSA;

import java.util.*;

public class RunningMedian {
  static PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>(Collections.reverseOrder());
  static PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();

  public static void main(String[] args) {
    insertNum(3);
    insertNum(1);
    insertNum(5);
    System.out.println(findMedian());
    insertNum(4);
    System.out.println(findMedian());
    insertNum(6);
    insertNum(8);
    System.out.println(findMedian());
  }

  public static void insertNum(int n) {
    if (maxheap.isEmpty() || maxheap.peek() >= n)
      maxheap.add(n);
    else
      minheap.add(n);

    if (maxheap.size() > minheap.size() + 1) {
      minheap.add(maxheap.peek());
      maxheap.poll();
    } else if (minheap.size() > maxheap.size()) {
      maxheap.add(minheap.peek());
      minheap.poll();
    }
  }

  public static double findMedian() {
    if (maxheap.size() == minheap.size())
      return (maxheap.peek() / 2.0) + (minheap.peek() / 2.0);
    return maxheap.peek();
  }
}
