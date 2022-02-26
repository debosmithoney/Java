//Kth Largest Elements 

package AnujBhaiya_DSA;

import java.util.*;

public class priorityQueue {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(0);
    arr.add(50);
    arr.add(40);
    arr.add(45);
    arr.add(30);
    arr.add(20);
    arr.add(35);
    arr.add(10);
    System.out.println(arr);
    System.out.println("Kth Largest : "+kLargest(arr,3));
    System.out.println("Kth Smallest : "+kSmallest(arr,3));
  }
  public static int kLargest(ArrayList<Integer>a,int k){
    PriorityQueue<Integer> q = new PriorityQueue<Integer>();
    for(int i=0;i<k;i++){
      q.add(a.get(i));
    }
    for(int i =k;i<a.size();i++){
      if(q.peek()<a.get(i)){
        q.poll();
        q.add(a.get(i));
      }
    }
    int c = q.peek();
    System.out.println("MinHeap: ");
    while(!q.isEmpty()){
      System.out.print(q.peek()+ " ");
      q.poll();
    }
    return c;

  }
  public static int kSmallest(ArrayList<Integer>a,int k){
    PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
    for(int i=0;i<k;i++){
      q.add(a.get(i));
    }
    for(int i =k;i<a.size();i++){
      if(q.peek()<a.get(i)){
        q.poll();
        q.add(a.get(i));
      }
    }
    int c = q.peek();
    System.out.println("MinHeap: ");
    while(!q.isEmpty()){
      System.out.print(q.peek()+ " ");
      q.poll();
    }
    return c;
  }
}
