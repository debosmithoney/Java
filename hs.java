import java.util.*;

public class hs {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(88);
        set.add(44);
        set.add(2);
        set.add(90);
        set.add(75);
        set.add(12);
        set.add(52);
        set.add(75);
        System.out.println("Output :");
        for (Integer ele : set) {
            System.out.print(ele+" ");
        }
        HashSet<Integer> ODD = new HashSet<Integer>();
        HashSet<Integer> EVEN = new HashSet<Integer>();
        for (Integer ele : set) {
            if (ele % 2 != 0)
                ODD.add(ele);
            else
                EVEN.add(ele);
        }
        System.out.println("\nODD :");
        for (Integer ele : ODD) {
            System.out.print(ele);
        }
        System.out.println("\nEVEN :");
        for (Integer ele : EVEN) {
            System.out.print(ele+" ");
        }
    }
}
