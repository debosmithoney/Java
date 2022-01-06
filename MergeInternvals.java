import java.util.*;

public class MergeInternvals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];

        List<int[]> list = new ArrayList<>();

        for (int i = 1; i < intervals.length; i++) {
            int first = intervals[i][0];
            int second = intervals[i][1];

            if (first <= end) {
                start = Math.min(start, first);
                end = Math.max(end, second);
            } else {
                int[] temp = new int[] { start, end };
                list.add(temp);
                start = first;
                end = second;
            }
        }
        int[] temp = new int[] { start, end };
        list.add(temp);

        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args){
        int[][] intervals ={{1,3},{2,6},{8,10},{15,18}};
        MergeInternvals obj = new MergeInternvals();
        int[][] newIntervals = obj.merge(intervals);
        for(int i = 0; i < newIntervals.length; i++){
            for(int j = 0; j < newIntervals[0].length; j++){
                System.out.print(newIntervals[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
