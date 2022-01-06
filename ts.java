import java.util.*;

public class ts {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(10);
        ts.add(2);
        ts.add(5);
        ts.add(8);
        ts.add(100);
        ts.add(20);
        ts.add(45);
        System.out.println("Output :");
        for (Integer ele : ts) {
            System.out.print(ele + " ");
        }
        //Closer or Greater
        System.out.println("\n"+ts.ceiling(5));
        //Greater
        System.out.println("\n"+ts.higher(5));
        //Closer or least
        System.out.println("\n"+ts.floor(5));
        //HeadSet
        TreeSet<Integer> head = new TreeSet<Integer>();
        head = (TreeSet<Integer>)ts.headSet(34); 
        System.out.println("HeadSet : "+head);
        //TailSet
        TreeSet<Integer> tail = new TreeSet<Integer>();
        tail = (TreeSet<Integer>)ts.tailSet(34); 
        System.out.println("TailSet : "+tail);
        
        System.out.println("Highest Number : "+ts.last());
        System.out.println("Lowest Number : "+ts.first());
        ts.remove(ts.first());
        ts.remove(ts.last());
        System.out.print("After Removing : ");
        System.out.println(ts);
        System.out.println("Size: "+ts.size());
    }
}
