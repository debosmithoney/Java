//Connect N Ropes

package AnujBhaiya_DSA;
import java.util.*;
public class NRopes {
  public static void main(String[] args) {
    ArrayList<Integer> nr = new ArrayList<Integer>();
    nr.add(2);
    nr.add(3);
    nr.add(6);
    nr.add(5);
    nr.add(9);
    nr.add(8);
    nr.add(4);
  }
  public static int nRopes(ArrayList<Integer> a){
    PriorityQueue<Integer> q = new PriorityQueue<Integer>();
    for (int i = 0; i < a.size(); i++) {
      q.add(a.get(i));
    }
    System.out.println(q);
    int ans =0;
    while(q.size() > 1){
      int first = q.peek();
      q.poll();
      int second = q.peek();
      q.poll();
      int sum = (first + second);
      ans+=sum;
      q.add(sum);
    }
    return ans;
  }
}
