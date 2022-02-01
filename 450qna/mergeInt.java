//Link: https://www.codingninjas.com/codestudio/problems/merge-intervals_699917?topList=love-babbar-dsa-sheet-problems&leftPanelTab=3

import java.util.*;

public class mergeInt {
  public static List<Interval> mergeIntervals(Interval[] intervals) {
    // write your code here.
    Arrays.sort(intervals, (x, y) -> x.start - y.start);
    ArrayList<Interval> result = new ArrayList<Interval>();
    for (int i = 0; i < intervals.length;) {
      int j = i + 1;
      while (j < intervals.length && intervals[j].start < intervals[j].finish) {
        intervals[i].finish = Math.max(intervals[i].finish, intervals[j].finish);
        j++;
      }
      result.add(intervals[i]);
      i = j;
    }
    return result;
  }

  public static void main(String args[]) {
    Interval arr[] = new Interval[4];
    arr[0] = new Interval(6, 8);
    arr[1] = new Interval(1, 9);
    arr[2] = new Interval(2, 4);
    arr[3] = new Interval(4, 7);
    List<Interval> result = mergeInt.mergeIntervals(arr);
    for (int i = 0; i < result.size(); i++) {
      System.out.println(result);
    }
  }
}

class Interval {
  int start, finish;

  Interval(int start, int finish) {
    this.start = start;
    this.finish = finish;
  }
}